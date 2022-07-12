// java code to find the nth term of an AP and GP
class p2 {
    public static int nthOfAnAP(int a, int d, int n) {
        return (a + (n - 1) * d);
    }

    public static int nthOfAGP(int a, int r, int n) {
        return (int) (a * Math.pow(r, n - 1));
    }

    public static int sumOfAP(int a, int d, int n) {
        return (int) (n * (2 * a + (n - 1) * d)) / 2;
    }

    public static int sumOfGP(int a, int r, int n) {
        return (int) (a * (Math.pow(r, n) - 1)) / (r - 1);
    }

    public static void main(String[] args) {
        System.out.println("AP : " + nthOfAnAP(2, 2, 10));
        System.out.println("GP : " + nthOfAGP(2, 2, 10));
        System.out.println("Sum of AP : " + sumOfAP(2, 2, 10));
        System.out.println("Sum of GP : " + sumOfGP(2, 2, 10));
    }
}