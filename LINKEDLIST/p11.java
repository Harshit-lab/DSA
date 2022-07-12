// java code to insert at the end of a doubly linked list
class Node {
    int data;
    Node prev, next;

    Node(int x) {
        data = x;
    }
}

class p11 {
    // method to insert at the end of a DLL
    public static Node insertAtTheEndOfDLL(Node head, int x) {
        Node current = new Node(x);
        if (head == null)
            return current;
        Node temp = head;
        while (temp.next != null)
            temp = temp.next;
        temp.next = current;
        current.prev = temp;
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
        Node head = insertAtTheEndOfDLL(null, 10);
        head = insertAtTheEndOfDLL(head, 20);
        head = insertAtTheEndOfDLL(head, 30);
        head = insertAtTheEndOfDLL(head, 40);
        display(head);
    }
}