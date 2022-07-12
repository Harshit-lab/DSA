// java code to determine the nature of roots of a quadratic equation
class p3 {
    public static String natureOfRoots(int a, int b, int c) {
        int D = (b * b) - (4 * a * c);
        if (D > 0)
            return "REAL";
        else if (D == 0)
            return "EQUAL";
        return "IMAGINARY";
    }

    public static void main(String[] args) {
        System.out.println("Roots : " + natureOfRoots(1, 2, 1));
    }
}