// java code for performing insertion and deletion operations in arrays
class p1 {
    // method to insert element at specified index in an array
    public static void insert(int[] arr, int numberOfElements, int capacityOfArray, int element, int position) {
        if (numberOfElements == capacityOfArray) {
            System.out.println("The array is already full. Cannot insert more elements.");
            return;
        }
        if (position > capacityOfArray) {
            System.out.println("Invalid position.");
            return;
        }
        for (int i = capacityOfArray - 1; i >= position - 1; i--)
            arr[i] = arr[i - 1];
        arr[position - 1] = element;
        printArrayElements(arr, numberOfElements + 1);
    }

    // method to delete element from specified index
    public static void delete(int[] arr, int numberOfElements, int element, int position) {
        if (position > numberOfElements || position < 1) {
            System.out.println("Invalid position.");
            return;
        }
        for (int i = position - 1; i < numberOfElements - 1; i++)
            arr[i] = arr[i + 1];
        printArrayElements(arr, numberOfElements - 1);
    }

    public static void printArrayElements(int[] arr, int n) {
        System.out.println("The array elements are:");
        for (int i = 0; i < n; i++)
            System.out.println(arr[i]);
    }

    public static void main(String[] args) {
        int[] arr = new int[5];
        arr[0] = 0;
        arr[1] = 1;
        arr[2] = 2;
        arr[3] = 3;
        insert(arr, 4, arr.length, 2, 6);
        delete(arr, 4, 1, 2);
    }
}