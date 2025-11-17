package ru.pliev.labs.lab5;

import java.util.List;

public class ReplaceFirstOccurrence {
    public static <T> void replace(List<T> L, List<T> L1, List<T> L2) {
        try {
            if (L == null || L1 == null || L2 == null) {
                System.out.println("Ошибка: один из списков равен null");
                return;
            }
            int startIndex = -1;
            for (int i = 0; i <= L.size() - L1.size(); i++) {
                boolean found = true;
                for (int j = 0; j < L1.size(); j++) {
                    if ( !L.get(i + j).equals(L1.get(j))) {
                        found = false;
                        break;
                    }
                }
                if (found) {
                    startIndex = i;
                    break;
                }
            }
            if (startIndex != -1) {
                for (int i = 0; i < L1.size(); i++) {
                    L.remove(startIndex);
                }
                L.addAll(startIndex, L2);
            }

        } catch (NullPointerException e) {
            System.out.println("Ошибка: NullPointerException - возможно, список содержит null элементы");
        } catch (UnsupportedOperationException e) {
            System.out.println("Ошибка: список неизменяемый");
        }
    }
}