import java.util.Scanner;

// java code to find out the floor of the square root of the number
class p9 {
    // method
    public static int squareRootFloored(int x) {
        int low = 1, high = x, answer = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            int midSquared = mid * mid;
            if (midSquared == x)
                return mid;
            else if (midSquared > x)
                high = mid - 1;
            else {
                low = mid + 1;
                answer = mid;
            }
        }
        return answer;
    }

    // driver code
    public static void main(String... args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the element for which the square root has to be calculated: ");
        int x = sc.nextInt();
        System.out.println(squareRootFloored(x));
        sc.close();
    }
}