// java code to count the number of digits in the number 
class p1 {
    public static int iterativeCountDigits(int n) {
        int count = 0;
        while (n != 0) {
            n /= 10;
            count += 1;
        }
        return count;
    }

    public static int recursiveCountDigits(int n) {
        if (n == 0)
            return 0;
        return 1 + recursiveCountDigits(n / 10);
    }

    public static int oneLineSolution(int n) {
        double n1 = n + 0.0;
        return (int) Math.ceil(Math.log10(n1));
    }

    public static void main(String[] args) {
        int n = 132785;
        System.out.println("Iterative Solution : " + iterativeCountDigits(n));
        System.out.println("Recursive Solution : " + recursiveCountDigits(n));
        System.out.println("One Line Solution : " + oneLineSolution(n));
    }
}