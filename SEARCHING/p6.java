
// java code to count the occurences in a sorted array 
import java.util.Scanner;

class p6 {
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

    public static void main(String... arg) {
        int[] arr = { 2, 2, 3, 3, 3, 3, 4, 5, 6, 6, 7 };
        Scanner sc = new Scanner(System.in);
        int element = sc.nextInt();
        int firstIndex = firstOccurence(arr, element);
        int lastIndex = lastOccurence(arr, element);
        int output = 0;
        if (firstIndex != -1)
            output = lastIndex - firstIndex + 1;
        System.out.println(firstIndex);
        System.out.println(lastIndex);
        System.out.println(output);
        sc.close();
    }
}