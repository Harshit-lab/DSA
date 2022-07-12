// recursive search in linked list
class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
    }
}

class p9 {
    // recursive method
    public static int recursiveSearch(Node head, int key) {
        if (head == null)
            return -1;
        if (head.data == key)
            return 1;
        else {
            int result = recursiveSearch(head.next, key);
            if (result == -1)
                return -1;
            return (result + 1);
        }
    }

    public static void main(String... args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        System.out.println(recursiveSearch(head, 10));
    }
}