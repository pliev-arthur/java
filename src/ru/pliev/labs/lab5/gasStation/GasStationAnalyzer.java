package ru.pliev.labs.lab5.gasStation;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class GasStationAnalyzer {
    public static void analyzeGasStations(String filename) {
        Map<GasolineType, GasolineInfo> result = new HashMap<>();

        for (GasolineType type : GasolineType.values()) {
            result.put(type, new GasolineInfo(Integer.MAX_VALUE, 0));
        }

        try {
            BufferedReader reader = new BufferedReader(new FileReader(filename));
            int n = Integer.parseInt(reader.readLine().trim());

            for (int i = 0; i < n; i++) {

                String line = reader.readLine().trim();

                if (line.isEmpty()) {
                    continue;
                }

                String[] parts = line.split(" ");

                if (parts.length != 4) {
                    continue;
                }

                try {
                    int typeNumber = Integer.parseInt(parts[2]);
                    int price = Integer.parseInt(parts[3]);

                    GasolineType type = GasolineType.fromInt(typeNumber);
                    GasolineInfo info = result.get(type);

                    if (price < info.getMinPrice()) {
                        info.setMinPrice(price);
                        info.setStationCount(1);
                    } else if (price == info.getMinPrice()) {
                        info.StationCountPlus1();
                    }

                } catch (IllegalArgumentException e) {
                    System.out.println("Пропущена некорректная строка: " + line);
                }
            }

        } catch (IOException e) {
            System.out.println("Ошибка чтения файла: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Ошибка формата числа в файле");
        }

        System.out.println(
                (result.get(GasolineType.TYPE_92).getMinPrice() == Integer.MAX_VALUE ? 0 : result.get(GasolineType.TYPE_92).getStationCount()) + " " +
                        (result.get(GasolineType.TYPE_95).getMinPrice() == Integer.MAX_VALUE ? 0 : result.get(GasolineType.TYPE_95).getStationCount()) + " " +
                        (result.get(GasolineType.TYPE_98).getMinPrice() == Integer.MAX_VALUE ? 0 : result.get(GasolineType.TYPE_98).getStationCount()));

    }
}