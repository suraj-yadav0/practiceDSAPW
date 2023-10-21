package LinkedList;

public class Implementation {

    public static class Node{
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static class linkedlist {
        Node head;
        Node tail;

        void insertAtEnd(int val){
            Node temp = new Node(val);
            if (head == null) {
                head = temp;
            }else {
                tail.next = temp;
            }
            tail = temp;
        }
        
        void insert(int val, int idx){
            Node t = new Node(val);
            Node temp = head;
            if (head == null) {
                inserAtStart(val);
                return;
            } else if (idx < 0) {
                System.out.println("Wrong Index.");
            } else if (idx == size()) {
                insertAtEnd(val);
                return;
            }else {
                for (int i = 1; i <= idx ; i++) {
                    temp = temp.next;

                }

                t.next = temp.next;
                temp.next =t;

            }
        }

        void inserAtStart(int val){
            Node temp = new Node(val);
            if (head == null) {
                head = tail = temp;
            }else {
                temp.next = head;
                head = temp;
            }
        }

        void display(){
            Node temp = head;
            while (temp != null){
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
        }

        int size(){
            int count = 0;
            Node temp = head;
            while (temp != null) {
                count++;
                temp = temp.next;
            }
            return count;
        }

    }
    public static void main(String[] args) {
linkedlist ll = new linkedlist();
ll.insertAtEnd(3);
ll.insertAtEnd(7);
ll.insertAtEnd(19);
ll.display();
        System.out.println();
        System.out.println(ll.size());
        System.out.println();
        ll.inserAtStart(1);
        ll.display();
    }
}
