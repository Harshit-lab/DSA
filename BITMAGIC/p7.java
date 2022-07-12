// java code to find out the two odd occuring elements
class p7 {
    public static void twoOddOccuring (int[] arr) {
        int xor = 0;
        for (int i=0; i<arr.length; i++)
            xor ^= arr[i];
        int output1 = 0, output2 = 0;
        int rightMostSetBit = xor & (~(xor-1));
        for (int i=0; i<arr.length; i++) {
            if ((rightMostSetBit & arr[i]) == 0)
                output1 ^= arr[i];
            else 
                output2 ^= arr[i];
        }
        System.out.println(output1 + " " + output2);
    }
    public static void main (String[] args) {
        int[] arr = {2,3,4,6,6,4,4,3};
        twoOddOccuring(arr);
    }
}