// java code to insert a node at specified position
class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
    }
}

class p7 {
    // method to insert at specified position
    public static Node insertAtSpecificPosition(Node head, int position, int data) {
        Node temp = new Node(data);
        if (position == 1) {
            temp.next = head;
            return temp;
        }
        Node current = head;
        for (int i = 1; i <= position - 2 && current != null; i++)
            current = current.next;
        if (current == null)
            return head;
        temp.next = current.next;
        current.next = temp;
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
        head = insertAtSpecificPosition(head, 1, 35);
        display(head);
    }
}