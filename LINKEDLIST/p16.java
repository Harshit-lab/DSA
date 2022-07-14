// traversal in a circular singly linked list
// insertion at the beginning of a circular singly linked list
class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
    }
}

class p16 {
    // insertion at the head
    public static Node insertAtHead(Node head, int key) {
        Node temp = new Node(key);
        if (head == null) {
            temp.next = temp;
            return temp;
        }
        Node nextNode = head.next;
        head.next = temp;
        temp.next = nextNode;
        int tempStorage = head.data;
        head.data = temp.data;
        temp.data = tempStorage;
        return head;
    }

    // traversal
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
        head = insertAtHead(head, 5);
        display(head);
    }
}