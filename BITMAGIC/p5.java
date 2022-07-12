// java code to check if a number is a power of 2
class p5 {
    public static boolean isPowerOfTwo (int n) {
        if (n == 0)
            return false;
        return ((n & (n-1)) == 0);
    }
    public static void main (String[] args) {
        int n = 86;
        System.out.println(isPowerOfTwo(n));
    }
}