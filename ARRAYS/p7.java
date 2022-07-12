// java code to move zeros to the end of the array
class p7 {
    public static int[] moveZerosToTheEnd(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                int temp = arr[i];
                arr[i] = arr[count];
                arr[count] = temp;
                count += 1;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = { 23, 0, 5, 0, 0, 0, 32 };
        int[] output = moveZerosToTheEnd(arr);
        for (int element : output)
            System.out.println(element);
    }
}