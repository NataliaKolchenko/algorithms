package example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }



    private static int funIteration(int x, int y){
        for (int i = x; i > 0; i--) {
            y = i + y;
        }
        return y;
    }


    private static int funRecursion(int x, int y) {
        if (x == 0) {
            return y;
        } else {
            int res = funRecursion(x - 1, x + y);
            System.out.println("res = " + res + "; x = " + x + "; y = " + y);
            return res;
        }
    }
}