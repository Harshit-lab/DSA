// java code to print the frequencies of elements in a sorted array
class p12 {
    public static void frequencies(int[] arr) {
        int count = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i - 1]) {
                System.out.println(arr[i - 1] + ":" + count);
                count = 1;
            } else
                count++;
        }
        System.out.println(arr[arr.length - 1] + ":" + count);
    }

    public static void main(String[] args) {
        int[] arr = { 12, 13, 14, 14, 14, 14, 20, 21, 21, 21 };
        frequencies(arr);
    }
}