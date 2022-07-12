// java code to get familiarity with bitwise operators in java
class p1 {
    public static void main (String[] args) {
        int x = 2, y = 3;
        // bitwise AND operation 
        System.out.println("AND : " + (x&y));
        // bitwise OR operation
        System.out.println("OR : " + (x|y));
        // bitwise XOR operation
        // returns 1 when the bits are different else returns 0
        System.out.println("XOR : " + (x^y));
    }
}