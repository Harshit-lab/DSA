// java code to print the leaders in an array
class p10 {
    public static void leaders(int[] arr) {
        int maximumElement = arr[arr.length - 1];
        System.out.println(maximumElement);
        for (int i = arr.length - 2; i >= 0; i--) {
            if (arr[i] > maximumElement) {
                System.out.println(arr[i]);
                maximumElement = arr[i];
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = { 23, 20, 9, 10, 5, 6 };
        leaders(arr);
    }
}