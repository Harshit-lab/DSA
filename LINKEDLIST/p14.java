// java code to delete the head of a doubly linked list
class Node {
    int data;
    Node next, prev;

    Node(int x) {
        data = x;
    }
}

class p14 {
    public static Node deleteHead(Node head) {
        if (head == null || head.next == null)
            return null;
        head.next.prev = null;
        return head.next;
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
        head = deleteHead(head);
        display(head);
    }
}