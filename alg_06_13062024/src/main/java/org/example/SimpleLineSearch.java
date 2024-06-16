package org.example;

public class SimpleLineSearch {
    public static void main(String[] args) {
        int[] arr = {1, 2, 0, 4, 5, 6};
        System.out.println("Number exists? - " + getNumber(arr, 6));
    }

    private static boolean getNumber(int[] arr, int number) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == number) {
                return true;
            }
        }
        return false;
    }
}
