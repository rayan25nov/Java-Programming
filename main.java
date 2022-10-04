package linkedList;
import linkedList.linkedList;
public class main {
    public static void main(String[] args) {
        linkedList ll = new linkedList(5);
        ll.append(6);
        ll.append(7);
        ll.append(9);
        ll.append(12);
        ll.prepend(130);
        ll.prepend(20);
        ll.prepend(10);
        ll.printList();
        ll.getHead();
        ll.getTail();
        ll.getLength();
        System.out.println( ll.removeLast().value);
        System.out.println( ll.removeLast().value);
        System.out.println( ll.removeLast().value);
        System.out.println( ll.removeLast().value);
    }
}
