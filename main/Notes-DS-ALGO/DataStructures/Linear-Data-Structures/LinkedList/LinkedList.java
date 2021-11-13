public class LinkedList {
    Node head;

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            next = null;

        }
    }

    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();

        // Memory Allocation of Each Node
        linkedList.head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        Node fourth = new Node(4);

        // Connecting Each Node
        linkedList.head.next = second;
        second.next = third;
        third.next = fourth;

        while (linkedList.head != null) {
            System.out.print(linkedList.head.data);

            if (linkedList.head.next != null) {
                System.out.print(" -> ");
            }
            linkedList.head = linkedList.head.next;
        }
    }
}
