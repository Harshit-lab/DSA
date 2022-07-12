// java code for maximum sub array sum
class p16 {
    public static int maxSubArraySum(int[] arr) {
        int result = arr[0], maxEnding = arr[0];
        for (int i = 1; i < arr.length; i++) {
            maxEnding = Math.max(arr[i], maxEnding + arr[i]);
            result = Math.max(maxEnding, result);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = { -3, 8, -2, 4, -5, 6 };
        System.out.println(maxSubArraySum(arr));
    }
}