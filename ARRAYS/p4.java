// java code to find out if the array is sorted or not
class p4 {
    public static boolean isSorted(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1])
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 1, 2, 3, 4, 101, 29 };
        System.out.println(isSorted(arr));
    }
}