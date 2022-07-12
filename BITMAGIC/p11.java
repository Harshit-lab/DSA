// java code to get the only odd occuring element in an array
class p11 {
    public static int oddOccuring (int[] arr) {
        int output = 0;
        for (int i=0; i<arr.length; i++)
            output ^= arr[i];
        return output;
    }
    public static void main (String[] args) {
        int[] arr = {34,27,28,10,34,20,20,28,10};
        System.out.println(oddOccuring(arr));
    }
}