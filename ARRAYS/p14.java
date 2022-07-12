// java code for rain trapping problem
// {5,0,6,2,3}
// The algorithm is to compute rightMax and leftMax array for each element
// and then calculate min(leftMax[i],rightMax[i]) - arr[i]
class p14 {
    public static int rainTrapping(int[] arr) {
        int[] rightMax = new int[arr.length], leftMax = new int[arr.length];
        int result = 0;
        leftMax[0] = arr[0];
        for (int i = 1; i < arr.length; i++)
            leftMax[i] = Math.max(arr[i], leftMax[i - 1]);
        rightMax[arr.length - 1] = arr[arr.length - 1];
        for (int i = arr.length - 2; i >= 0; i--)
            rightMax[i] = Math.max(arr[i], rightMax[i + 1]);
        for (int i = 0; i < arr.length; i++)
            result += Math.min(leftMax[i], rightMax[i]) - arr[i];
        return result;
    }

    public static void main(String[] args) {
        int[] arr = { 5, 0, 6, 2, 3 };
        System.out.println(rainTrapping(arr));
    }
}