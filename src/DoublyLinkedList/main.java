package DoublyLinkedList;

public class main {
    public static class Node {
        int val;
        Node next;
        Node prev;
        Node(int val) {
            this.val = val;
        }



    }

    public static void main(String[] args) {
        Node a  = new Node(4);
        Node b  = new Node(8);
        Node c  = new Node(12);
        Node d  = new Node(16);

        a.prev = null;
        a.next = b;
        b.prev = a;
        b.next = c;
        c.prev = b;
        c.next = d;
        d.prev = c;
        d.next = null;

    }
}
