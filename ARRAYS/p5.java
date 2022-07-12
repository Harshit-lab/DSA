// java code to reverse an array without using an auxilliary array
class p5 {
    public static int[] reverseArray(int[] arr) {
        int low = 0, high = arr.length - 1;
        while (low < high) {
            int temp = arr[high];
            arr[high] = arr[low];
            arr[low] = temp;
            high--;
            low++;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 4, 5 };
        int[] reversedArray = reverseArray(arr);
        System.out.println("The reversed array:");
        for (int i : reversedArray)
            System.out.println(i);
    }
}