// java code to find the first occurence of an element in a sorted array
class p4 {
    // iterative solution
    public static int iterativeFirstOccurence(int[] arr, int element) {
        int low = 0, high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] < element)
                low = mid + 1;
            else if (arr[mid] > element)
                high = mid - 1;
            else {
                if (mid == 0 || arr[mid - 1] != arr[mid])
                    return mid;
                else
                    high = mid - 1;
            }
        }
        return -1;
    }

    // recursive solution
    public static int recursiveFirstOccurence(int[] arr, int low, int high, int element) {
        if (low > high)
            return -1;
        int mid = (low + high) / 2;
        if (arr[mid] > element)
            return recursiveFirstOccurence(arr, low, mid - 1, element);
        else if (arr[mid] < element)
            return recursiveFirstOccurence(arr, mid + 1, high, element);
        else {
            if (mid == 0 || arr[mid - 1] != arr[mid])
                return mid;
            else
                return recursiveFirstOccurence(arr, low, mid - 1, element);
        }
    }

    public static void main(String[] args) {
        int[] arr = { 1, 1, 1, 2, 2, 3, 4, 7, 8 };
        System.out.println("Iterative: " + iterativeFirstOccurence(arr, 2));
        System.out.println("Recursive: " + recursiveFirstOccurence(arr, 0, arr.length - 1, 10));
    }
}