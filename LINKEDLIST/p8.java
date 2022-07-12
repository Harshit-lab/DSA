// java code to search for an element in a singly linked list
class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
    }
}

class p8 {
    // method
    public static int searchLinkedList(Node head, int key) {
        Node current = head;
        int output = -1, counter = 0;
        while (current != null) {
            counter += 1;
            if (current.data == key) {
                output = counter;
                break;
            }
            current = current.next;
        }
        return output;
    }

    public static void main(String... args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        System.out.println(searchLinkedList(head, 0));
    }
}