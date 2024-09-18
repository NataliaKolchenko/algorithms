package example;
//1. Задача: вызов лифта
//В доме два лифта.
//Реализовать алгоритм отправки наиближайшего на вызывающий этаж.
//Алгоритм будет применяться в домах разной этажности.
//        Пример:
//в доме 19 этажей
//работают лифт А и лифт В
//лифт А находиться на 0 этаже
//лифт В находиться на 8 этаже
//на вход: 1
//отправляем лифт А

public class GreedyAlg2LiftTasks {
    public static void main(String[] args) {

        int[] floorInHouse = {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19};

        int entrance = 1;
        int a = 0;
        int b = 8;

        int aLift = 0;
        int bLift = 0;

        for (int i = 0; i < floorInHouse.length; i++) {
          int temp = floorInHouse[i] - entrance;

          if (temp < 0) {
              temp = floorInHouse[i] + entrance;
          }

          if (floorInHouse[i] == a) {
              aLift = temp;
          }

          if (floorInHouse[i] == b){
              bLift = temp;
          }

        }

        if (aLift < bLift) {
            System.out.println("a_lift " + aLift + " floors");
        } else {
            System.out.println("b_lift " + bLift + " floors");
        }

    }
}