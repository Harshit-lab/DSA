// java code to delete the head of a circular linked list
class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
    }
}

class p18 {
    public static Node deleteHead(Node head) {
        if (head == null || head.next == null)
            return null;
        head.data = head.next.data;
        head.next = head.next.next;
        return head;
    }

    public static void display(Node head) {
        Node current = head;
        do {
            System.out.println(current.data);
            current = current.next;
        } while (current != head);
    }

    public static void main(String... args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = head;
        display(head);
        head = deleteHead(head);
        System.out.println("After deleting the head");
        display(head);
    }
}