package example;

//task #2
//
//START
//READ number n
//        numbers i = 0, j = 0, a = 0
//        FOR i = n/2, i <= n; i + 1
//        FOR j = 2, j <= n, j * 2
//a = a + n / 2
//END

//временная сложность задачи:N * N
// O(n^2)

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        int i = 0, j = 0, a = 0; //1 + 1  + 1

        for (i = n/2; i <= n; i++){ // N
            for (j = 2; j <= n; j = j*2){ // N
                a = a + n /2;
            }
        }

    }
}
