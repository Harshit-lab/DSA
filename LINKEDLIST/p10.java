// insert a node at the beginning of a doubly linked list
class Node {
    int data;
    Node next;
    Node prev;

    Node(int x) {
        data = x;
    }
}

class p10 {
    // method to insert at the beginning of a DLL
    public static Node insertAtBegninningOfDLL(Node head, int key) {
        Node temp = new Node(key);
        if (head == null)
            return temp;
        head.prev = temp;
        temp.next = head;
        return temp;
    }

    public static void display(Node head) {
        Node current = head;
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }

    // driver code
    public static void main(String... args) {
        Node head = insertAtBegninningOfDLL(null, 10);
        head = insertAtBegninningOfDLL(head, 20);
        head = insertAtBegninningOfDLL(head, 30);
        head = insertAtBegninningOfDLL(head, 40);
        display(head);
    }
}