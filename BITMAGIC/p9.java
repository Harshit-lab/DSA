// java code to count the number of set bits
class p9 {
    public static int countSetBits (int n) {
        int output = 0;
        while (n!=0) {
            n = n & (n-1);
            output += 1;
        }
        return output;
    }
    public static void main (String[] args) {
        System.out.println(countSetBits(14));
    }
}