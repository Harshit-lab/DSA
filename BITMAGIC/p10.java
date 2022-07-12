// java code to check if a number is a power of 2
class p10 {
    public static boolean isAPowerOfTwo (int n) {
        if ((n & (n-1)) == 0)
            return true;
        return false;
    }
    public static void main (String[] args) {
        System.out.println(isAPowerOfTwo(16));
    }
}