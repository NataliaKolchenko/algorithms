package example;

//task #3

//START
//READ number n
//number a = 0
//        FOR i = 0, i < n, i + 1
//        FOR j = n, j > i, j - 1
//a = a + i + j
//        END

import java.util.Scanner;

//временная сложность задачи:N * K
// O(n^k)

public class Task3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        int a = 0;

        for (int i = 0; i < n; i++) { // N
            for (int j = n; j > 1; j--){ //K
                a = a + i + j;
            }

        }


    }
}
