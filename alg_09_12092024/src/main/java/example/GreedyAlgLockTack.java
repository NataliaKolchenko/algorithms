package example;

//Вам дан замок, состоящий из n различных круглых колец, на каждом из которых последовательно напечатаны цифры от 0 до 9.
//Изначально все n-колец вместе показывают n-значное целое число, но существует только определенный код, который может открыть замок.
//Вы можете вращать каждое кольцо любое количество раз в любом направлении.
//Вы должны найти минимальное количество оборотов на кольцах замка, чтобы открыть замок.

//Ввод: Ввод = 2345, Код разблокировки = 5432
//Выход: требуется оборотов = 8
//Объяснение: 1-е кольцо вращается трижды, как 2->3->4->5         (2->1->0->9->8->7->6->5)
//        2-е кольцо вращается один раз как 3->4
//        3-е кольцо поворачивается один раз как 4->3
//        4-е кольцо вращается трижды как 5->4->3->2
//
//Ввод: Ввод = 1919, Код разблокировки = 0000
//Выход: требуется оборотов = 4
//Объяснение: 1-е кольцо вращается один раз как 1-> 0
//        2-е кольцо поворачивается один раз как 9-> 0
//        3-е кольцо вращается один раз как 1-> 0
//        4-е кольцо поворачивается один раз как 9->0

public class GreedyAlgLockTack {
    public static void main(String[] args) {
        int[] lock = {2,3,4,5};
        int[] activateCode = {5,4,3,2};

        int counter = 0; // количество оборотов

        for (int i = 0; i < lock.length; i++) {
            int temp = lock[i] - activateCode[i];

            int up = temp < 0 ? temp + 10 : temp;
            int down = -temp < 0 ? -temp + 10 : -temp;
            counter += up > down ? down : up;
        }
        System.out.println(counter);
    }
}