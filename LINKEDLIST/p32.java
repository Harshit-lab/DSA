// iterative reversal of linked list
class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
    }
}

class p32 {
    public static Node reverseLinkedList(Node head) {
        if (head == null || head.next == null)
            return head;
        Node current = head;
        Node previousNode = null;
        while (current != null) {
            Node nextNode = current.next;
            current.next = previousNode;
            previousNode = current;
            current = nextNode;
        }
        return previousNode;
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
        head = reverseLinkedList(head);
        display(head);
    }
}