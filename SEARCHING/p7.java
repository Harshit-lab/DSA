import java.util.Scanner;

// java code to count the occurences in a sorted array
class p7 {
    // first occurence
    public static int firstOccurence(int[] arr, int element) {
        int low = 0, high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] < element)
                low = mid + 1;
            else if (arr[mid] > element)
                high = mid - 1;
            else {
                if (mid == 0 || arr[mid] != arr[mid - 1])
                    return mid;
                else
                    high = mid - 1;
            }
        }
        return -1;
    }

    // last occurence
    public static int lastOccurence(int[] arr, int element) {
        int low = 0, high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] < element)
                low = mid + 1;
            else if (arr[mid] > element)
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
        int[] arr = { 1, 2, 3, 3, 3, 6, 6, 10 };
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the element: ");
        int element = sc.nextInt();
        if (firstOccurence(arr, element) == -1)
            System.out.println(0);
        else
            System.out.println(lastOccurence(arr, element) - firstOccurence(arr, element) + 1);
        sc.close();
    }
}