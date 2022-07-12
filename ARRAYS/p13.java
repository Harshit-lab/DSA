// java code for stock B/S problem
/*
    |
    |
    |
    |
    |          /
    |     /\  /
    |    /  \/
    |   /
    ----------------------------------
       A   B  C D
       A: Buy because it is a low
       B: Sell at B because it is a peak
       C: Buy because it is a low
       D: Sell because it is a peak
*/
class p13 {
    public static int maxProfit(int[] arr) {
        int profit = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[i - 1]) {
                profit += arr[i] - arr[i - 1];
            }
        }
        return profit;
    }

    public static void main(String[] args) {
        int[] arr = { 2, 5, 9, 4, 10, 6, 15 };
        System.out.println(maxProfit(arr));
    }
}