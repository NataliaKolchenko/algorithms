package example;

public class GreedyAlg3LiftTasks {
    public static void main(String[] args) {
        int[] floorInHouse = {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19};

        int entrance = 3;
        int a = 19;
        int b = 18;
        int c = 9;

        int aLift = 0;
        int bLift = 0;
        int cLift = 0;

        for (int i = 0; i < floorInHouse.length; i++) {
            int temp = floorInHouse[i] - entrance;

            if (temp < 0) temp = floorInHouse[i] + entrance;

            if (floorInHouse[i] == a)  aLift = temp;

            if (floorInHouse[i] == b) bLift = temp;

            if (floorInHouse[i] == c) cLift = temp;

        }

        int min = 0;
        if (a < b){
            min = a;
        } else {
            min = b;
        }
        if (c < min) min = c;

        if (min == a) System.out.println("a_lift " + aLift + " floors");
        if (min == b) System.out.println("b_lift " + bLift + " floors");
        if (min == c) System.out.println("c_lift " + cLift + " floors");

    }
}
