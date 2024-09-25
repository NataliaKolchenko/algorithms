package example;

public class MainTree {
    public static void main(String[] args) {

        BinaryTree bt = new BinaryTree();

         bt.insert(3);
         bt.insert(1);
         bt.insert(2);
         bt.insert(4);
         bt.print();

         bt.delete(3);
         bt.print();
    }
}