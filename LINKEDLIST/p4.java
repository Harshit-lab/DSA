// java code for insertion at the end of the linked list
class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}

class p4 {
    public static Node insertAtTheEnd(Node head, int element) {
        Node temp = new Node(element);
        if (head == null)
            return temp;
        Node current = head;
        while (current.next != null)
            current = current.next;
        current.next = temp;
        return head;
    }

    public static void displayLinkedList(Node head) {
        Node current = head;
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }

    public static void main(String... args) {
        Node head = insertAtTheEnd(null, 10);
        Node node1 = insertAtTheEnd(head, 20);
        Node node2 = insertAtTheEnd(node1, 30);
        displayLinkedList(head);
    }
}