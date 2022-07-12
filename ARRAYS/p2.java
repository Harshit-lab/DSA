// java code to find the maximum element in an array
class p2 {
    public static int maximumElement(int[] arr) {
        int result = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (result < arr[i]) {
                result = arr[i];
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = { 34, 29, 90, 27, 9, 182, 28 };
        System.out.println(maximumElement(arr));
    }
}