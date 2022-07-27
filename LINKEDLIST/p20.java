// deleting the head of a circular linked list
class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
    }
}

class p20 {
    public static Node deleteHeadOfCircularLinkedList(Node head) {
        if (head == null || head.next == head)
            return null;
        Node nextNode = head.next.next;
        head.data = head.next.data;
        head.next = nextNode;
        return head;
    }

    public static void display(Node head) {
        if (head == null)
            return;
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
        head = deleteHeadOfCircularLinkedList(head);
        display(head);
    }
}