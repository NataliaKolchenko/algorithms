package example;

import java.util.Stack;

public class Tower {
    public static void main(String[] args) {
        Stack<Integer> firstTower = new Stack<>();;
        Stack<Integer> secondTower = new Stack<>();;
        Stack<Integer> thirdTower = new Stack<>();;

        firstTower.push(3);
        firstTower.push(2);
        firstTower.push(1);

        printTowers(firstTower, secondTower, thirdTower);
        handyApproach(firstTower, secondTower, thirdTower);

//        System.out.println("------------");
//        int count = 3;
//
//        towerRecursion (firstTower, secondTower, thirdTower, count);
//        printTowers(firstTower, secondTower, thirdTower);
    }

    public static void printTowers (Stack<Integer> firstSt, Stack<Integer> secondSt, Stack<Integer> thirdSt) {
        System.out.println();
        System.out.println(firstSt);
        System.out.println(secondSt);
        System.out.println(thirdSt);
    }

    //Я смогла реализовать только ручной подход перекладывания дисков (пока окраничивалось 3 шт)
    // к сожалению, не смогла это преобразовать ни в итаритивный алгоритм, ни в рекурсивный :(
    public static void handyApproach(Stack<Integer> firstTower, Stack<Integer> secondTower, Stack<Integer> thirdTower) {
        thirdTower.push(firstTower.pop());
        secondTower.push(firstTower.pop());

        printTowers(firstTower, secondTower, thirdTower);

        secondTower.push(thirdTower.pop());
        thirdTower.push(firstTower.pop());

        printTowers(firstTower, secondTower, thirdTower);

        firstTower.push(secondTower.pop());

        printTowers(firstTower, secondTower, thirdTower);

        thirdTower.push(secondTower.pop());

        printTowers(firstTower, secondTower, thirdTower);

        thirdTower.push(firstTower.pop());

        printTowers(firstTower, secondTower, thirdTower);
    }

    //это код рекурсивного метода взят из интернета
    // но мне кажется, но не совсем корректно работает, т.к в какой-то момент цифры просто меняются местами (между дисками)
    public static void towerRecursion (Stack<Integer> firstTower, Stack<Integer> secondTower, Stack<Integer> thirdTower, int count) {
        if (count > 0) {
            towerRecursion(firstTower, thirdTower, secondTower,count-1);
            int biggest = firstTower.pop();
            thirdTower.push(biggest);
            towerRecursion(secondTower,firstTower,thirdTower, count-1);
        }
    }
}
