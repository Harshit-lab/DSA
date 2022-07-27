// java code to insert at the head of a circular doubly linked list 
class Node {
    int data;
    Node next, prev;

    Node(int x) {
        data = x;
    }
}

class p22 {
    public static Node insertAtHead(Node head, int x) {
        Node temp = new Node(x);
        if (head == null) {
            temp.next = temp;
            temp.prev = temp;
            return temp;
        }
        temp.next = head;
        temp.prev = head.prev;
        head.prev.next = temp;
        head.prev = temp;
        return temp;
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

    public static void main(String... args) {
        Node head = new Node(67);
        head.next = head;
        head.prev = head;
        head = insertAtHead(head, 40);
        head = insertAtHead(head, 30);
        head = insertAtHead(head, 20);
        head = insertAtHead(head, 10);
        display(head);
    }
}