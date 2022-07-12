// java code to delete the last node of a singly linked list
class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
    }
}

class p6 {
    public static Node deleteLastNode(Node head) {
        if (head == null || head.next == null)
            return null;
        Node current = head;
        while (current.next.next != null)
            current = current.next;
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
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head = deleteLastNode(head);
        display(head);
    }
}