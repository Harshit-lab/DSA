// java code to check if the Kth bit is set or not
class p3 {
    public static boolean checkKthBit (int n, int k) {
        if (((1 << (k-1)) & n) != 0)
            return true;
        return false;
    }
    public static void main (String[] args) {
        int n = 13, k = 2;
        System.out.println(checkKthBit(n,k));
    }
}