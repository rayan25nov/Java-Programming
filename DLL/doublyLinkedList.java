package doublyLL;

public class doublyLinkedList {
    private Node head;
    private Node tail;
    private int length;

    class Node{
        int value;
        Node next;
        Node prev;

        Node(int value){
            this.value = value;
        }
    }

    doublyLinkedList(int value){
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;
    }

    public void getHead(){
        System.out.println("Head :" + head.value);
    }
    public void getTail(){
        System.out.println("Tail :" + tail.value);
    }
    public void getLength(){
        System.out.println("Length :" + length);
    }
    public void print(){
        Node temp = head;
        while(temp != null){
            System.out.println(temp.value);
            temp = temp.next;
        }
    }
}
