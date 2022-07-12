// recursive java code to display the nodes of a linked list
class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class p2 {

    // recursive method to traverse the linked list
    public static void recursiveLinkedListTraversal(Node head) {
        if (head == null)
            return;
        System.out.println(head.data);
        recursiveLinkedListTraversal(head.next);
    }

    public static void main(String... args) {
        Node head = new Node(10);
        Node node1 = new Node(20);
        Node node2 = new Node(30);
        head.next = node1;
        node1.next = node2;
        recursiveLinkedListTraversal(head);
    }
}