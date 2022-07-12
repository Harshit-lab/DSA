// java code to left rotate an array by one
class p8 {
    public static int[] leftRotateByOne(int[] arr) {
        int temp = arr[0];
        for (int i = 0; i < arr.length - 1; i++)
            arr[i] = arr[i + 1];
        arr[arr.length - 1] = temp;
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6 };
        int[] output = leftRotateByOne(arr);
        for (int element : output)
            System.out.println(element);
    }
}