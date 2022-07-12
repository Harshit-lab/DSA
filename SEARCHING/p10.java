import java.util.Scanner;

// java code to calculate the floor of the square root of a number

class p10 {
    // method
    public static int floorOfSquareRoot(int element) {
        int low = 1, high = element, output = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            int midSquared = mid * mid;
            if (midSquared == element)
                return mid;
            else if (midSquared > element)
                high = mid - 1;
            else {
                low = mid + 1;
                output = mid;
            }
        }
        return output;
    }

    // driver code
    public static void main(String... args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int element = sc.nextInt();
        System.out.println(floorOfSquareRoot(element));
        sc.close();
    }
}