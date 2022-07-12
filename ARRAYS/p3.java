// java code to return the second largest element in an array
class p3 {
    public static int secondLargest(int[] arr) {
        int result = -1;
        int maximum = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > maximum) {
                result = maximum;
                maximum = arr[i];
            } else if (arr[i] < maximum) {
                if (result == -1 || result < arr[i])
                    result = arr[i];
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 1, 1, 1, 1 };
        int output = secondLargest(arr);
        if (output == -1)
            System.out.println("Second Largest element does not exist");
        else
            System.out.println(output);
    }
}