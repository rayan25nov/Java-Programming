package doublyLL;

public class main {
    public static void main(String[] args) {
        doublyLinkedList dll = new doublyLinkedList(5);
        dll.append(6);
        dll.append(7);
        dll.append(8);
        // dll.removeLast();
        // dll.removeLast();
        // dll.prepend(4);
        // dll.prepend(3);
        // dll.removeFirst();
        // dll.removeFirst();
        // dll.set(0, 19);
        dll.insert(1, 22);
        dll.remove(1);
        System.out.println("----Get By Index----");
        System.out.println("Index 0: " + dll.get(0).value);
        dll.getHead();
        dll.getTail();
        dll.getLength();
        dll.print();
    }
}
