// insert at the beginning of a linked list
class Node {
    int x;
    Node next;

    Node(int x) {
        this.x = x;
    }
}

class p3 {
    // method
    public static Node insertAtTheBgenning(Node head, int data) {
        Node current = new Node(data);
        if (head == null)
            return current;
        current.next = head;
        return current;
    }

    public static void displayLinkedList(Node head) {
        Node current = head;
        while (current != null) {
            System.out.println(current.x);
            current = current.next;
        }
    }

    // driver method
    public static void main(String... args) {
        Node head = insertAtTheBgenning(null, 10);
        Node node1 = insertAtTheBgenning(head, 20);
        Node node2 = insertAtTheBgenning(node1, 30);
        displayLinkedList(node2);
    }
}