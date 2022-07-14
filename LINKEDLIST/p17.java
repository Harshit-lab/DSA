// java code to insert a node at the end of a circular singly linked list
class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
    }
}

class p17 {
    // insertion at the tail
    public static Node insertAtTail(Node head, int key) {
        Node temp = new Node(key);
        if (head == null) {
            temp.next = temp;
            return temp;
        }
        Node nextNode = head.next;
        head.next = temp;
        temp.next = nextNode;
        int dataOfHeadNode = head.data;
        head.data = temp.data;
        temp.data = dataOfHeadNode;
        return temp;
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
        head = insertAtTail(head, 40);
        display(head);
    }
}