package LinkedList;

public class basic {

    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    static int length(Node head) {
        int count  = 0;
        while (head != null) {
            count++;
            head = head.next;
        }
        return count;
    }

    static void displayusingRecursion(Node head){
        if (head == null) return;

        displayusingRecursion(head.next);
        System.out.print(head.data + " ");
    }

    static void display(Node head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }
    public static void main(String[] args) {
Node X = new Node(45);
Node a = new Node(1);
Node b = new Node(2);
Node c = new Node(3);
Node d = new Node(4);
a.next = b;
b.next = c;
c.next = d;
d.next = X;
        display(a);
        System.out.println();
        displayusingRecursion(a);
        System.out.println();
        System.out.println("Length of LinkedList is:"+ length(a));
    }
}
