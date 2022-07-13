// java code to reverse a doubly linked list
class Node {
    int data;
    Node next, prev;

    Node(int x) {
        data = x;
    }
}

class p12 {
    // method to reverse the linked list
    public static Node reverseLinkedList(Node head) {
        if (head == null || head.next == null)
            return head;
        Node current = head;
        Node previous = null;
        while (current != null) {
            previous = current.prev;
            current.prev = current.next;
            current.next = previous;
            current = current.prev;
        }
        return previous.prev;
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
        head.next.prev = head;
        head.next.next = new Node(30);
        head.next.next.prev = head.next;
        head = reverseLinkedList(head);
        display(head);
    }
}