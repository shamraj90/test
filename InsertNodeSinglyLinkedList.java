public class InsertNodeSinglyLinkedList {

    public static void main(String[] args) {


    }

    static SinglyListNode insertNodeAtPosition(SinglyListNode headNode, SinglyListNode nodeToInsert, int position) {
        if (headNode == null) {
            return nodeToInsert;
        }
        if (position == 1) {
            nodeToInsert.next = headNode;
            return nodeToInsert;
        } else {
            SinglyListNode previousNode = headNode;
            int count = 1;
            while (count < position - 1) {
                previousNode = previousNode.next;
                count++;
            }

            SinglyListNode currentPositionNode = previousNode.next;
            nodeToInsert.next = currentPositionNode;
            previousNode.next = nodeToInsert;
        }
        return headNode;
    }

}


class SinglyListNode {
    int data;
    SinglyListNode next;

}
