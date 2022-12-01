public class SortingAlgorithms {
    public static int[] selectionSort(int[] input) {
        int n = input.length;
        for (int i = 0; i < n-1; i++) {
            int min_index = i;
            for (int j = i +1;j < n;j++) {
                if (input[j] < input[min_index]) {
                    min_index = j;
                }
            }
            int temp = input[min_index];
            input[min_index] = input[i];
            input[i] = temp;
            printArr(input);
        }
        return input;
    }
    public static void printArr(int[] arry) {
        for (int i: arry) {
            System.out.print(i);
        }
        System.out.print("\n");
    }
    public static void main(String[] args) {
        int[] array = new int[]{0,1,5,3,4,-1,6,9,-2,5};
        printArr(selectionSort(array));
    }
}
