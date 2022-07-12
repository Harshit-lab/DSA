// java code to search in an infinite sized array

class p11 {
    // method for binary search
    public static int binarySearch(int[] arr, int low, int high, int element) {
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == element)
                return mid;
            else if (arr[mid] > element)
                high = mid - 1;
            else
                low = mid + 1;
        }
        return -1;
    }

    public static int infinteSearch(int[] arr, int element) {
        if (arr[0] == element)
            return 0;
        int i = 1;
        while (arr[i] < element) {
            i *= 2;
        }
        if (arr[i] == element)
            return i;
        return binarySearch(arr, (i / 2) + 1, i - 1, element);
    }

    // driver code
    public static void main(String... args) {
        int[] arr = { 1, 2, 4, 6, 7, 8, 9, 10, 40, 472, 2930 };
        int element = 2930;
        System.out.println(infinteSearch(arr, element));
    }
}