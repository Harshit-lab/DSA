import javax.sound.midi.SysexMessage;

// java code to create a linked list

class Node {
    int element;
    Node next;

    public Node(int element) {
        this.element = element;
        this.next = null;
    }
}

class p1 {

    public static void displayLinkedList(Node head) {
        if (head == null)
            return;
        Node current = head;
        while (current != null) {
            System.out.println(current.element);
            current = current.next;
        }
    }

    public static void main(String... args) {
        Node node1 = new Node(10);
        Node node2 = new Node(20);
        Node node3 = new Node(30);
        node1.next = node2;
        node2.next = node3;
        displayLinkedList(node1);
    }
}