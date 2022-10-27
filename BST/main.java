package Bst;

public class main {
    public static void main(String[] args) {
        binaryST bst = new binaryST();
        bst.insert(5);
        bst.insert(4);
        bst.insert(6);
        System.out.println("root: " + bst.root.value);
        System.out.println("left: " + bst.root.left.value);
        System.out.println("right: " + bst.root.right.value);
        System.out.println(bst.contains(6));
        System.out.println(bst.contains(7));
    }
}
