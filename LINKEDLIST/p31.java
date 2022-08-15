// java code to reverse a linked list iteratively
class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
    }
}

class p31 {
    public static Node reverse(Node head) {
        if (head == null || head.next == null)
            return head;
        Node current = head;
        Node previous = null;
        while (current != null) {
            Node nextNode = current.next;
            current.next = previous;
            previous = current;
            current = nextNode;
        }
        return previous;
    }

    public static void display(Node head) {
        if (head == null) {
            System.out.println("The linked list is empty!");
            return;
        }
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
        head = reverse(head);
        display(head);
    }
}