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


//временная сложность задачи: (1 + N + 1) * (1 + N + 1)
// O(n^2)

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

        for (int i = 1; i <= n; i++) { { //1+ N+ 1
            for (int j = 1; j <= n ; j++) { // 1+N+1
                System.out.println("*");

            }
            break;
        }

        }
    }
}