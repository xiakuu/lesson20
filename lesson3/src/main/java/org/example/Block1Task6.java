package org.example;


public class Block1Task6 {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 7, 5, 4, 9, 5, 2, 8};
        int check = 1;
        int maxValue = Integer.MIN_VALUE;
        int beforeMaxValue = 0;

        for (int i = 0; i < arr.length; i++) {
            if (check < 2) {
                maxValue = arr[i];
                beforeMaxValue = arr[i];
                check = 3;
                continue;
            }
            if (arr[i] > maxValue) {
                beforeMaxValue = maxValue;
                maxValue = arr[i];
            }
            if (arr[i] < maxValue && arr[i] > beforeMaxValue) {
                beforeMaxValue = arr[i];
            }

        }
        System.out.println("Большее число из массива " + maxValue + ", предмаксимальное - " + beforeMaxValue);
    }
}
