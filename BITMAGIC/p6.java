// java code to get the one odd occuring element
class p6 {
    public static int oneOddOccuring (int[] arr) {
        int xor = 0;
        for (int i=0; i<arr.length; i++)
            xor = xor ^ arr[i];
        return xor;
    }
    public static void main (String[] args) {
        int[] arr = {2,4,5,4,4,2,5};
        System.out.println(oneOddOccuring(arr));
    }
}