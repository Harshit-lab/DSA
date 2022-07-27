// java code to delete the Kth node where K <= number of nodes in the circular linked list
class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
    }
}

class p21 {
    public static Node deleteHead(Node head) {
        if (head == null || head.next == null)
            return null;
        head.data = head.next.data;
        head.next = head.next.next;
        return head;
    }

    public static Node deleteKthNode(Node head, int K) {
        if (head == null)
            return null;
        if (K == 1)
            return deleteHead(head);
        Node current = head;
        for (int i = 0; i < K - 2; i++)
            current = current.next;
        current.next = current.next.next;
        return head;
    }

    public static void display(Node head) {
        Node current = head;
        if (head == null)
            return;
        do {
            System.out.println(current.data);
            current = current.next;
        } while (current != head);
    }

    public static void main(String... args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = head;
        head = deleteKthNode(head, 4);
        display(head);
    }
}