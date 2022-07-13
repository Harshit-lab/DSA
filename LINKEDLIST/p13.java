// java code to reverse a doubly linked list
class Node {
    int data;
    Node prev, next;

    Node(int x) {
        data = x;
    }
}

class p13 {
    public static Node reverseLinkedList(Node head) {
        if (head == null || head.next == null)
            return null;
        Node current = head, previous = null;
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
        Node head = new Node(30);
        head.next = new Node(20);
        head.next.prev = head;
        head.next.next = new Node(10);
        head.next.next.prev = head.next;
        head = reverseLinkedList(head);
        display(head);
    }
}