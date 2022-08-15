// recursive java code to reverse a linked list with an extra parameter
class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
    }
}

class p30 {
    public static Node recursiveReversalOfLinkedList(Node head, Node previous) {
        if (head == null || head.next == null)
            return head;
        Node current = head;
        Node nextNode = current.next;
        current.next = previous;
        current = nextNode;
        return recursiveReversalOfLinkedList(current, previous);
    }
}