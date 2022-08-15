package HASHING;

// direct address table concept
public class p1 {
    public static boolean[] arr = new boolean[1000];

    // method to insert the values
    public static void insert(int n) {
        arr[n] = true;
    }

    // method to delete the values
    public static void delete(int n) {
        arr[n] = false;
    }

    // method to search the given value
    public static boolean search(int n) {
        return (arr[n] == true);
    }

    // driver code
    public static void main(String... args) {
        insert(10);
        insert(39);
        insert(34);
        System.out.printf("%d present? %s%n", 39, search(39));
        System.out.printf("%d present? %s%n", 304, search(304));
        delete(10);
        System.out.printf("%d present? %s%n", 10, search(10));
    }
}