package example;

public class BinaryTree {
    private MyNode root;

    public BinaryTree(MyNode root) {
        this.root = root;
    }

    public BinaryTree() {
    }

    public MyNode getRoot() {
        return root;
    }

    public void setRoot(MyNode root) {
        this.root = root;
    }

    // вставка через циклы (итеративно)
    //реализовано на лекции
    public void insert(int value) {
        MyNode newMyNode = new MyNode();
        newMyNode.setValue(value);

        if (root == null) { // пустое дерево
            root = newMyNode;
        } else {
            MyNode current = root;
            MyNode parent = null;

            while (true) {
                parent = current;
                if (value == current.getValue()) {
                    return;
                } else if (value < current.getValue()) { // если элемент меньше, уходим в левую подветку
                    current = current.getLeft();
                    if (current == null) {
                        parent.setLeft(newMyNode);
                        return;
                    }
                } else {
                    current = current.getRight(); // если элемент больше текущего, идем вправо
                    if (current == null) {
                        parent.setRight(newMyNode);
                        return;
                    }

                }
            }
        }
    }

    // вставка через рекурсию
    //реализовано на лекции
    public MyNode insertRecursive(MyNode current, MyNode newMyNode) {
        if (root == null) {
            root = newMyNode;
            return newMyNode;
        }
        if (current == null) {
            return newMyNode;
        }

        if (newMyNode.getValue() < current.getValue()) {
            current.setLeft(insertRecursive(current.getLeft(), newMyNode));
        } else if (newMyNode.getValue() > current.getValue()) {
            current.setRight(insertRecursive(current.getRight(), newMyNode));
        } else {
            return current;
        }
        return current;
    }
//реализовано на лекции
    public MyNode find(int value) {
        MyNode current = root; // начинаем поиск с корневого узла

        while (current.getValue() != value) { // поиск пока не будет найден элемент или не будут перебраны все
            if (current.getValue() > value) { // движение влево?
                current = current.getLeft();
            } else {
                current = current.getRight(); //движение вправо
            }
            if (current == null) { // если потомка нет,
                return null;
            }
        }
        return current; // возвращаем найденный элемент
    }

    private MyNode findMinElement(MyNode node){
        while (node.getRight() != null) {
            node = node.getLeft();
        }
        return node;
    }

    public void print() {
        System.out.println(root);
    }


    public void delete(int value) {
        MyNode node = find(value);
        if (node.getValue() == value && node.getLeft() == null && node.getRight() == null) {
            deleteLeaf(node);
        } else if (node.getValue() == value && node.getLeft() != null && node.getRight() != null) {
            deleteNodeWithOneChild(node);
        } else {
            deleteNodeWithTwoChild(node);
        }
    }

    private void deleteLeaf(MyNode node) {
        MyNode parentNode = findParent(node, node.getValue());
        if (parentNode.getLeft().getValue() == node.getValue()){
            parentNode.setLeft(null);
        } else {
            parentNode.setRight(null);
        }
    }

    private MyNode findParent(MyNode node, int value) {
        // Если дерево пустое или корневой узел содержит искомое значение, то родителя нет (вернем null)
        if (root == null || root.getValue() == value) {
            return null;
        }

        // Ищем родителя слева
        if (root.getLeft() != null && root.getLeft().getValue() == value) {
            return root;  // Если левый потомок содержит искомое значение, то root — родитель
        }

        // Ищем родителя справа
        if (root.getRight() != null && root.getRight().getValue() == value) {
            return root;  // Если правый потомок содержит искомое значение, то root — родитель
        }

        // Если значение меньше текущего узла, ищем в левом поддереве
        if (value < root.getValue()) {
            return findParent(root.getLeft(), value);
        }

        // Если значение больше текущего узла, ищем в правом поддереве
        return findParent(root.getRight(), value);
    }

    private void deleteNodeWithOneChild(MyNode node) {
        if (node.getLeft() != null) {
            node.setValue(node.getLeft().getValue());
            node.setLeft(null);
        } else if (node.getRight() != null) {
            node.setValue(node.getRight().getValue());
            node.setRight(null);
        }
    }

    // не смогла побороть - этот метод работает некорректно
    private void deleteNodeWithTwoChild(MyNode node){
        MyNode minElem = findMinElement(node.getRight());
        node.setValue(minElem.getValue());

        MyNode f = findMinElement(minElem.getRight());
        node.setLeft(f);

    }



}
