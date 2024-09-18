package example;
//Начало недели, у разработчика в бэклоге есть список задач от разных отделов,
//каждая из которых требует определённого времени для выполнения.
//Разработчик може в неделю работать определенное количество времени maxTime.
//Мы хотим выбрать максимальное количество задач, которые можно выполнить,
//учитывая ограничение по времени.
//Используйте подход жадного алгоритма по критерию: время выполнения задачи.

import java.util.Arrays;

public class GreedyAlgTimeTask {
    public static void main(String[] args) {

        int[] tasks = {3, 5, 18, 1, 7, 11, 14, 6, 23, 2, 6};
        int maxTime = 20;
        int[] finalScope = new int[tasks.length];
        int counter = 0;

        int [] tempArr =  Arrays.stream(tasks).sorted().toArray();

        for (int i = 0; i < tempArr.length; i++) {
            if (maxTime > 0 && maxTime >= tempArr[i]) {
                finalScope[i] = tempArr[i];
                maxTime = maxTime - tempArr[i];
                counter++;
            }

        }

        System.out.println(Arrays.toString(finalScope));
        System.out.println(counter);
    }
}