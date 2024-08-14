package example;

import java.util.Arrays;

public class QuickSortRecursionLastElem {
    public static void main(String[] args) {

        int[] array = {17,14,15,28,6,8,-6,1,3,18};
        System.out.println("Unsorted Array: " + Arrays.toString(array));
        quickSort (array, 0, array.length-1);
        System.out.println("Sorted Array: " + Arrays.toString(array));
    }

    public static void quickSort(int[] arr, int low, int max) {
        if (low < max) {
            int pivotIndex = partition(arr, low, max);

            quickSort(arr, low, pivotIndex -1);
            quickSort(arr, low+1, pivotIndex);
        }
    }

    //Метод partition определяет положение опорного элемента (здесь выбран последний элемент массива)
    // и переставляет элементы так, чтобы элементы меньше опорного находились слева от него, а большие — справа.
    // Этот метод возвращает индекс опорного элемента после перестановки.
    private static int partition (int[] arr, int low, int max) {
        int pivot = arr[max];
        int i = (low -1);
        for (int j = low; j < max; j++) {
            if (arr[j] < pivot) {
                i++;
                // Перестановка элементов
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }

        }
        // Перестановка опорного элемента на правильную позицию
        int temp2 = arr[ i+ 1];
        arr[i+1] = arr[max];
        arr[max] = temp2;


        return i +1;
    }


}