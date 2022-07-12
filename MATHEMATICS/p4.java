
// java code to find out the mean and median of a group of numbers
import java.util.Arrays;

class p4 {
    public static double mean(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++)
            sum += arr[i];
        return sum / arr.length;
    }

    public static double median(int[] arr) {
        Arrays.sort(arr);
        int mid = arr.length / 2;
        if (arr.length % 2 == 1)
            return Double.valueOf(arr[mid]);
        return (arr[mid] + arr[mid - 1]) / 2;
    }

    public static void main(String[] args) {
        int[] arr = { 43, 67, 28, 63, 23 };
        System.out.println("Mean : " + mean(arr));
        System.out.println("Median : " + median(arr));
    }
}