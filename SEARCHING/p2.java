// java code for recursive binary search
class p2 {
    public static int recursiveBinarySearch(int[] sortedArray, int low, int high, int element) {
        if (low > high)
            return -1;
        int mid = (low + high) / 2;
        if (sortedArray[mid] == element)
            return mid;
        else if (sortedArray[mid] > element)
            return recursiveBinarySearch(sortedArray, low, mid - 1, element);
        else
            return recursiveBinarySearch(sortedArray, mid + 1, high, element);
    }

    public static void main(String[] args) {
        int[] sortedArray = { 23, 25, 28, 30, 36 };
        System.out.println(recursiveBinarySearch(sortedArray, 0, sortedArray.length - 1, 50));
    }
}