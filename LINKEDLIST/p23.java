// java code to insert at the end of a circular doubly linked list
class Node {
    int data;
    Node next, prev;

    Node(int x) {
        data = x;
    }
}

class p23 {
    public static Node insertAtEnd(Node head, int element) {
        Node temp = new Node(element);
        if (head == null) {
            temp.next = temp;
            temp.prev = temp;
            return temp;
        }
        temp.next = head;
        temp.prev = head.prev;
        head.prev.next = temp;
        head.prev = temp;
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

    // Driver code
    public static void main(String... args) {
        Node head = null;
        head = insertAtEnd(head, 10);
        head = insertAtEnd(head, 20);
        head = insertAtEnd(head, 30);
        head = insertAtEnd(head, 40);
        display(head);
    }
}