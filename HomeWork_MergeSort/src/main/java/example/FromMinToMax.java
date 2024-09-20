package example;

import java.util.Arrays;

public class FromMinToMax {
    public static void main(String[] args) {
        int[] arr1 = new int[] {21,23,24,40};
        int[] arr2 = new int[] {10,11,41,50};

        int[] arrFinal = new int[arr1.length + arr2.length];

        int i = 0;
        int j = 0;

        for (int k = 0; k < arrFinal.length; k++){

            //если i больще, чем длина 1го массива
            if (i > arr1.length-1){
                int a = arr2[j];
                arrFinal[k] = a;
                j++;
            }
            //если j больще, чем длина 2го массива или  i-ый элемент из 1го массива меньше, чем j-ый элемент из 2го массива
            else if (j > arr2.length-1 || arr1[i] < arr2[j]) {
                int a = arr1[i];
                arrFinal[k] = a;
                i++;
            }

            else {
                int b = arr2[j];
                arrFinal[k] = b;
                j++;
            }
        }

        System.out.println(Arrays.toString(arrFinal));

    }
}