// java code to insert an element in a sorted linked list
class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
    }
}

class p24 {
    public static Node insertInSortedLinkedList(Node head, int element) {
        Node toBeInserted = new Node(element);
        if (head == null || element <= head.data) {
            toBeInserted.next = head;
            return toBeInserted;
        }
        Node current = head;
        while (current.next != null && current.next.data < toBeInserted.data)
            current = current.next;
        toBeInserted.next = current.next;
        current.next = toBeInserted;
        return head;
    }

    public static void display(Node head) {
        Node current = head;
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }

    // driver code
    public static void main(String... args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head = insertInSortedLinkedList(head, 34);
        head = insertInSortedLinkedList(head, 5);
        head = insertInSortedLinkedList(head, 50);
        display(head);
    }
}