// java code to left rotate an array by D places
class p9 {
    public static int[] leftRotateByD(int[] arr, int d) {
        reverse(arr, 0, d - 1);
        reverse(arr, d, arr.length - 1);
        reverse(arr, 0, arr.length - 1);
        return arr;
    }

    public static int[] reverse(int[] arr, int low, int high) {
        while (low < high) {
            int temp = arr[high];
            arr[high] = arr[low];
            arr[low] = temp;
            low++;
            high--;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6 };
        int[] output = leftRotateByD(arr, 2);
        for (int element : output)
            System.out.println(element);
    }
}