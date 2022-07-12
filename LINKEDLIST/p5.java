// java code to delete the head of a singly linked list
class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
    }
}

class p5 {
    public static Node deleteHead(Node head) {
        if (head == null || head.next == null)
            return null;
        return head.next;
    }

    public static void displayLinkedList(Node head) {
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
        head = deleteHead(head);
        displayLinkedList(head);
    }
}