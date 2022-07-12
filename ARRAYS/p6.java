// java code to move the distinct elements of the array to the beginning
class p6 {
    public static int[] moveDistinctElementsToTheBeginning(int[] arr) {
        int lastUniqueElement = 0, size = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[lastUniqueElement]) {
                arr[++lastUniqueElement] = arr[i];
                size++;
            }
        }
        System.out.println("The number of unique elements: " + size);
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = { 2, 2, 2, 4, 5, 6, 6, 6, 6, 7, 8 };
        int[] output = moveDistinctElementsToTheBeginning(arr);
        for (int element : output)
            System.out.println(element);
    }
}