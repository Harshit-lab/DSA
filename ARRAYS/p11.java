// java code to get the maximum difference between arr[i] and arr[j] where j > i
class p11 {
    public static int maxDifference(int[] arr) {
        int output = arr[1] - arr[0], minElement = arr[0];
        for (int i = 1; i < arr.length; i++) {
            output = Math.max(output, arr[i] - minElement);
            minElement = Math.min(minElement, arr[i]);
        }
        return output;
    }

    public static void main(String[] args) {
        int[] arr = { 10, 12, 3, 15 };
        System.out.println(maxDifference(arr));
    }
}