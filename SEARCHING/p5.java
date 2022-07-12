// java code to find the last occurence of an element in a sorted array
class p5 {
    // iterative solution
    public static int iterativeLastOccurence(int[] arr, int element) {
        int low = 0, high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] > element)
                high = mid - 1;
            else if (arr[mid] < element)
                low = mid + 1;
            else {
                if (mid == arr.length - 1 || arr[mid] != arr[mid + 1])
                    return mid;
                else
                    low = mid + 1;
            }
        }
        return -1;
    }

    // recursive solution
    public static int recursiveLastOccurence(int[] arr, int low, int high, int element) {
        if (low > high)
            return -1;
        int mid = (low + high) / 2;
        if (arr[mid] > element)
            return recursiveLastOccurence(arr, low, mid - 1, element);
        else if (arr[mid] < element)
            return recursiveLastOccurence(arr, mid + 1, high, element);
        else {
            if (mid == arr.length - 1 || arr[mid] != arr[mid + 1])
                return mid;
            else
                return recursiveLastOccurence(arr, mid + 1, high, element);
        }
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 4, 4, 5, 6, 7, 8, 8 };
        System.out.println("Iterative: " + iterativeLastOccurence(arr, -2));
        System.out.println("Recursive: " + recursiveLastOccurence(arr, 0, arr.length - 1, 10));
    }
}