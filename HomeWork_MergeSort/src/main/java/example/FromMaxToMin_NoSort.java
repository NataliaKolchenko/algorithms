package example;

import java.util.Arrays;

public class FromMaxToMin_NoSort {
    public static void main(String[] args) {
        int[] arr1 = new int[]{21, 23, 24, 40};
        int[] arr2 = new int[]{10, 11, 41, 50} ;



        int[] arrFinal = new int[arr1.length + arr2.length];

        int i = arr1.length - 1;
        int j = arr2.length - 1;

        for (int k = 0; k < arrFinal.length; k++) {
             if (i < 0) {
                int a = arr2[j];
                arrFinal[k] = a;
                j--;
            } else if (j < 0){
                int b = arr1[i];
                arrFinal[k] = b;
                i--;
            }
            else if (arr2[j] > arr1[i]) {
                int a = arr2[j];
                arrFinal[k] = a;
                j--;

            } else if (arr2[j] < arr1[i]) {
                int b = arr1[i];
                arrFinal[k] = b;
                i--;

            }


        }

        System.out.println(Arrays.toString(arrFinal));

    }
}
