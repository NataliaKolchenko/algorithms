package example;
import java.util.Scanner;

//task #1
//START
//READ number n
//IF n == 1 THEN return
//        FOR i = 1, i <= n, i + 1
//FOR j = 1; j <= n, j + 1
//print "*"
//BREAK
//END


//временная сложность задачи: (1 + N + 1) * (1 + N + 1) -> incorrect
// O(n^2) -> incorrect

//1+2(n)*3+1 = O(n)

public class Task1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        task1(n);

    }

    public static void task1 (int n) {
        if (n == 1) {
            return;
        }

        for (int i = 1; i <= n; i++) { { //1+ N+ 1 -> incorrect; correct: costs = 3, times = n;
            for (int j = 1; j <= n ; j++) { // 1+N+1 -> incorrect; correct: costs = 3, times = 1;
                System.out.println("*");
                break;
            }

        }

        }
    }
}