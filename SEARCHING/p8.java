// java code to find the number of zeros in a sorted binary array
class p8 {
    // count the last occurence of zero
    public static int lastOccurenceOfZero(int[] arr) {
        int low = 0, high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] != 0)
                high = mid - 1;
            else {
                if (mid == arr.length - 1 || arr[mid] != arr[mid + 1])
                    return mid;
                else
                    low = mid + 1;
            }
        }
        return -1;
    }

    // driver code
    public static void main(String... args) {
        int[] arr = { 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1 };
        int[] arr1 = { 0, 0, 0, 0, 0, 0 };
        int[] arr2 = { 1, 1, 1, 1, 1, 1, 1, 1 };
        if (arr2[0] != 0)
            System.out.println(0);
        else
            System.out.println(lastOccurenceOfZero(arr2) + 1);
    }
}