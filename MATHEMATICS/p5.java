// java code to check for palindrome number
class p5 {
    public static boolean isPalindrome(int n) {
        int n1 = n;
        int rev = 0;
        while (n != 0) {
            int x = n % 10;
            rev = rev * 10 + x;
            n /= 10;
        }
        return rev == n1;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(78787));
    }
}