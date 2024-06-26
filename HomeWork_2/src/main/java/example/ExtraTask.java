package example;
//временная сложность задачи: 1 + ((n * 2) / n) + n = 1 + 2 + n
//O (n)


public class ExtraTask {
    public static void main(String[] args) {
        resize(5);

    }

    static int[] arr = new int[2]; //1
    static int index = 0;
    static void resize(int val) {
        int n = arr.length;
        if (index >= n) {
            int[] newArr = new int[n * 2]; //n*2
            for (int i = 0; i < arr.length; i++) { //n
                newArr[i] = arr[i]; // n
            }
            arr[index++] = val;
        }
    }
}
