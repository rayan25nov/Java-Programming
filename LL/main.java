package linkedList;

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
        // System.out.println("----Remove First------");
        // System.out.println(ll.removeFirst().value);
        // System.out.println(ll.removeFirst().value);
        // System.out.println(ll.removeFirst().value);
        // System.out.println("----Remove Last-------");
        // System.out.println( ll.removeLast().value);
        // System.out.println( ll.removeLast().value);
        // System.out.println( ll.removeLast().value);
        // System.out.println( ll.removeLast().value);
        System.out.println("----Element at index-------");
        System.out.println("index 4: " + ll.getIndex(4).value);
        System.out.println("index 2: " +ll.getIndex(2).value);
        System.out.println("index 1: " +ll.getIndex(1).value);
        System.out.println("index 0: " +ll.getIndex(0).value);
        System.out.println("----Set Element at index-------");
        ll.set(0, 140);
        System.out.println("index 0: " +ll.getIndex(0).value);
        System.out.println("----Insert Element at index-------");
        ll.insert(0, 200);
        ll.insert(4, 566);
        System.out.println("------Print-------");
        ll.remove(0);
        ll.printList();
        System.out.println("------Reverse-------");
        ll.reverse();
        ll.printList();
    }
}
