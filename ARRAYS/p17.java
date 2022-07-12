// java code to print the maximum sub array sum
// Kadane's Algorithm
class p17 {
    public static int kadane(int[] arr) {
        int maxSum = arr[0], result = arr[0];
        for (int i = 1; i < arr.length; i++) {
            maxSum = Math.max(arr[i], maxSum + arr[i]);
            result = Math.max(maxSum, result);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = { -3, 8, -2, 4, -5, 6 };
        System.out.println(kadane(arr));
    }
}