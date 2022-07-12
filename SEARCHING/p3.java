// java code to perform binary search
class p3 {
    // iterative binary search
    public static int iterativeBinarySearch(int[] sortedArray, int element) {
        int low = 0, high = sortedArray.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (sortedArray[mid] == element)
                return mid;
            else if (sortedArray[mid] < element)
                low = mid + 1;
            else
                high = mid - 1;
        }
        return -1;
    }

    // recursive binary search
    public static int recursiveBinarySearch(int[] sortedArray, int low, int high, int element) {
        if (low > high)
            return -1;
        int mid = (low + high) / 2;
        if (sortedArray[mid] == element)
            return mid;
        else if (sortedArray[mid] < element)
            return recursiveBinarySearch(sortedArray, mid + 1, high, element);
        else
            return recursiveBinarySearch(sortedArray, low, mid - 1, element);
    }

    public static void main(String[] args) {
        int[] sortedArray = { 12, 14, 16, 17, 18 };
        System.out.println("Iterative answer: " + iterativeBinarySearch(sortedArray, 16));
        System.out.println("Recursive answer: " + recursiveBinarySearch(sortedArray, 0, sortedArray.length - 1, 16));
    }
}