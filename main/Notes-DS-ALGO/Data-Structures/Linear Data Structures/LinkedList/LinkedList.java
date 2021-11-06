public class LinkedList {
    class Node {
        int data;
        Node next;

        Node(Node head, int data) {
            this.data = data;
            head.next = null;
        }
    }
}
