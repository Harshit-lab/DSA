// java code to compute the maximum number of consecutive 1's 
class p15 {
    public static int maxNumberOfOnes(int[] arr) {
        int currentElement = arr[0], result = 0, countOfCurrentOnes = 0;
        if (currentElement == 1) {
            result = 1;
            countOfCurrentOnes = 1;
        }
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == 0) {
                result = Math.max(result, countOfCurrentOnes);
                countOfCurrentOnes = 0;
            } else {
                countOfCurrentOnes += 1;
                result = Math.max(result, countOfCurrentOnes);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = { 0, 0, 0, 0, 1, 1, 1, 0, 1, 1 };
        System.out.println(maxNumberOfOnes(arr));
    }
}