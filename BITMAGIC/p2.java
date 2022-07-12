// java code to explore the negation operator as well as the left and right shift operators
class p2 {
    public static void main (String[] args) {
        int x = -2;
        System.out.println("NOT : " + (~x));
        System.out.println("LEFT SHIFT : " + (x << 1));
        System.out.println("RIGHT SHIFT : " + (x >> 1));
        System.out.println("UNSIGNED RIGHT SHIFT : " + (x >>> 1));
    }
}