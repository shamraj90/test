public class LinkedListCycleDetect {

    public static boolean hasCyclic(Node head) {
        if (head == null)
            return false;

        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                return true;
            }

        }
        return false;
    }


}

class Node {

    int data;
    Node next;

}


