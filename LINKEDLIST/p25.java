// java code to find the middle node of a linked list
class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
    }
}

class p25 {
    public static int middleOfLinkedList(Node head) {
        if (head == null || head.next == null)
            return Integer.MIN_VALUE;
        Node fastPointer = head;
        Node slowPointer = head;
        while (fastPointer != null && fastPointer.next != null) {
            fastPointer = fastPointer.next.next;
            slowPointer = slowPointer.next;
        }
        return slowPointer.data;
    }

    public static void main(String... args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        System.out.println(middleOfLinkedList(head));
    }
}