public class MergeSortedList {
    static class ListNode {
      int val;
      ListNode next;

      ListNode() {}
      ListNode(int val) {
          this.val = val;
      }
      ListNode(int val, ListNode next) {
          this.val = val;
          this.next = next;
      }
    }

    public static void mergeTwoLists(ListNode list1, ListNode list2) {

        // Case 1
        if (list1 == null && list2 == null) {
            return;
        }

        // Case 2
        if (list1 == null) {
            return;
        }

        if (list2 == null) {
            return;
        }

        // Case 3
        ListNode head = new ListNode();

        // setting the head node
        if (list1.val <= list2.val) {
            head.val = list1.val;
            list1 = list1.next;
        } else {
            head.val = list2.val;
            list2 = list2.next;
        }

        ListNode temp = head;

        while (list1 != null && list2 != null) {
            ListNode newNode = new ListNode();

            if (list1.val <= list2.val) {
                newNode.val = list1.val;
                list1 = list1.next;
            } else {
                newNode.val = list2.val;
                list2 = list2.next;
            }

            temp.next = newNode;
            temp = temp.next;

        }

        // if the list1 and list2 are not having same sizes
        while (list1 != null) {
            ListNode newNode = new ListNode();

            newNode.val = list1.val;
            list1 = list1.next;

            temp.next = newNode;
            temp = temp.next;
        }

        // if the list1 and list2 are not having same sizes
        while (list2 != null) {
            ListNode newNode = new ListNode();

            newNode.val = list2.val;
            list2 = list2.next;

            temp.next = newNode;
            temp = temp.next;
        }

        display(head);
    }

// case 1 - same number of nodes in both the LL
// case 2 - not same number of nodes in both the LL
// case 3 - one LL contains 1 node and second contains no node
// case 4 - one LL contains no node and second contains 1 node

    public static void display(ListNode list) {
        while (list != null) {
            System.out.print(list.val);
            if (list.next != null) System.out.print(" -> ");
            if (list.next == null) System.out.print(" -> null");
            list = list.next;
        }
    }

    public static void main(String[] args) {
        ListNode list1, list2;

        // structure of first LL
        list1 = new ListNode(1);
        ListNode two = new ListNode(2);
        ListNode third = new ListNode(3);

        list1.next = two;
        two.next = third;
        third.next = null;
        // 1 -> 2 -> 3

        // structure of second LL
        list2 = new ListNode(2);
        ListNode four = new ListNode(4);
        ListNode five = new ListNode(5);

        list2.next = four;
        four.next = five;
        five.next = null;
        // 2 -> 4 -> 5

        mergeTwoLists(list1, list2);
    }
}
