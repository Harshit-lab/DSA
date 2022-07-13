// java code to delete the tail of a doubly linked list
class Node {
    int data;
    Node next, prev;

    Node(int x) {
        data = x;
    }
}

class p15 {
    public static Node deleteTail(Node head) {
        if (head == null || head.next == null)
            return null;
        Node current = head;
        while (current.next.next != null)
            current = current.next;
        current.next.prev = null;
        current.next = null;
        return head;
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
        head = deleteTail(head);
        display(head);
    }
}