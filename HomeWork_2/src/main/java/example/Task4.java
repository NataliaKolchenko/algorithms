package example;

//task #4
//
//START
//READ number n
//        numbers a = 0, i = n
//WHILE i > 0
//a = a + i
//        i = i / 2
//END

//временная сложность задачи:N
// O(n)

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        int a = 0, i = n;

        while (i > 0) { //N
            a = a + i;
            i = i / 2;
        }


    }
}
