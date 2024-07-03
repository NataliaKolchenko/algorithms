package example;

public class Factorial {
    public static void main(String[] args) {

        System.out.println("итеративный: " + countFactorialItera(5));
        System.out.println("рекурсивный: " + countFactorialRecurs(5));
    }

    //итеративный
    static int countFactorialItera(int number) {
        int resultFactorial = 1;
        for (int i =  1; i <= number; i++) {
            resultFactorial *= i;
        }
        return resultFactorial;
    }

    //рекурсивный
    static int countFactorialRecurs (int num) {
        int res = 1;
        for (int i = 1; i <= num; i++) {
            res = res * i;
        }

        return res;
    }

}