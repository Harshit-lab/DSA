// java code to perform binary search
class p1 {
    public static int binarySearch(int[] sortedArray, int elementToBeSearched) {
        int low = 0, high = sortedArray.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (sortedArray[mid] == elementToBeSearched)
                return mid;
            else if (sortedArray[mid] > elementToBeSearched)
                high = mid - 1;
            else
                low = mid + 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] sortedArray = { 35, 39, 49, 56, 60 };
        System.out.println(binarySearch(sortedArray, 35));
    }
}