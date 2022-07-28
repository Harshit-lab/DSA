// java code to find the Nth node from the last of the linked list
class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
    }
}

class p26 {
    public static void nthNodeFromLast(Node head, int n) {
        if (head == null)
            return;
        Node first = head;
        for (int i = 0; i < n; i++) {
            if (first == null)
                return;
            first = first.next;
        }
        Node second = head;
        while (first != null) {
            second = second.next;
            first = first.next;
        }
        System.out.println(second.data);
    }

    public static void main(String... args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        nthNodeFromLast(head, 4);
    }
}