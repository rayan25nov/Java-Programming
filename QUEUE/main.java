package Queue;

public class main {
    public static void main(String[] args) {
        queue qw = new queue(1);
        qw.enQueue(2);
        qw.enQueue(3);
        qw.deQueue();
        qw.getFirst();
        qw.getLast();
        qw.getLength();
        qw.printQueue();
    }
}
