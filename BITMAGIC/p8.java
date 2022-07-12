// java code to check if the Kth bit is set or not
class p8 {
    public static boolean checkBit (int n, int k) {
        if ((n & (1 << (k-1))) != 0)
            return true;
        return false;
    }
    public static void main (String[] args) {
        System.out.println(checkBit(23,3));
    }
}