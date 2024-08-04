package example;
//Имея два отсортированных массива размера m и n соответственно, вам нужно найти элемент,
//который будет находиться на k-й позиции в конечном отсортированном массиве.
//        (При объединении массива пытайтесь соединить их так, чтобы результирующий общий массив
//был бы уже отсортирован и его не нужно было повторно сортировать. )
//Массив 1 - 100 112 256 349 770
//Массив 2 - 72 86 113 119 265 445 892
//к = 7
//Вывод : 256
//Окончательный отсортированный массив -
//        72, 86, 100, 112, 113, 119, 256, 265, 349, 445, 770, 892
//        7-й элемент этого массива равен 256.

import java.util.*;

public class TwoSortedArr {
    public static void main(String[] args) {

        int[] arr1 = {100, 112, 256, 349, 770};
        int[] arr2 = {72, 86, 113, 119, 265, 445, 892};

        int index = 7;

//1 version
        System.out.println("1 version " + findElemWithArr(arr1, arr2, index));

// 2 version
        System.out.println("2 version " + algFindElemWithArr(arr1, arr2, index));


    }

    public static int findElemWithArr(int[] arr1, int[] arr2, int index) {
        List<Integer> listNumbers = new ArrayList<>();

        for (int i = 0; i < arr1.length; i++) {
            listNumbers.add(arr1[i]);
        }
        for (int i = 0; i < arr2.length; i++) {
            listNumbers.add(arr2[i]);
        }

        Collections.sort(listNumbers);
        System.out.println(listNumbers);


        for (int i = 0; i < listNumbers.size(); i++) {
            if ((i + 1) == index) {
                return listNumbers.get(i);
            }


        }


        return 0;
    }

    public static int algFindElemWithArr(int[] arr1, int[] arr2, int index) {
       int[] finalArr =  joinArrays(arr1, arr2);
        System.out.println(Arrays.toString(finalArr));
        int finalNum = 0;
        for (int i = 0; i < finalArr.length; i++) {
            if (i == index-1) {
                finalNum = finalArr[i];
            }
            
        }
        return finalNum;
    }

    public static int[] joinArrays(int[] arr1, int[] arr2) {

        int[] finalArray = new int[arr1.length + arr2.length];
        int  finalArrayIndex = 0;
        int i = 0, j = 0;

        while (i < arr1.length && j < arr2.length) {

                if (arr1[i] < arr2[j]) {
                    finalArray[finalArrayIndex] = arr1[i];
                    i++;
                } else {
                    finalArray[finalArrayIndex] = arr2[j];
                    j++;
                }
                finalArrayIndex++;
            }

        while (i < arr1.length) {
            finalArray[finalArrayIndex] = arr1[i];
            finalArrayIndex++;
            i++;
        }

        while (j < arr2.length) {
            finalArray[finalArrayIndex] = arr2[j];
            finalArrayIndex++;
            j++;
        }

        return finalArray;
    }
    







}
