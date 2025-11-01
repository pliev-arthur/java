package ru.pliev.labs.lab4.functions;

public class MaxFromList implements Function<int[], Integer> {
    @Override
    public Integer apply(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}
