// java code to recursively reverse a linked list
class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
    }
}

class p29 {
    public static Node recursiveReversalOfLinkedList(Node head) {
        if (head == null || head.next == null)
            return head;
        Node restHead = recursiveReversalOfLinkedList(head.next);
        Node restTail = head.next;
        restTail.next = head;
        head.next = null;
        return restHead;
    }

    public static void display(Node head) {
        Node current = head;
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }

    public static void main(String... args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head = recursiveReversalOfLinkedList(head);
        display(head);
    }
}