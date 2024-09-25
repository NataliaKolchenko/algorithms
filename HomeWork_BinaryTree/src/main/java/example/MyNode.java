package example;

//Binary tree search (BST)
public class MyNode {
    private int value;
    private MyNode left;
    private MyNode right;

    public MyNode(int value, MyNode left, MyNode right) {
        this.value = value;
        this.left = left;
        this.right = right;
    }

    public MyNode() {
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public MyNode getLeft() {
        return left;
    }

    public void setLeft(MyNode left) {
        this.left = left;
    }

    public MyNode getRight() {
        return right;
    }

    public void setRight(MyNode right) {
        this.right = right;
    }

    @Override
    public String toString() {
        return "Node{" +
                "value=" + value +
                ", left=" + left +
                ", right=" + right +
                '}';
    }
}
