public class QuickSort {

    // Partition Function
    public static int partition(int[] arr, int st, int end) {
        int idx = st - 1;
        int pivot = arr[end];

        for (int j = st; j < end; j++) {
            if (arr[j] <= pivot) { // Comparisions
                idx++;

                // Swap arr[idx] with arr[j]
                int[] temp = arr[idx];
                arr[idx] = arr[j];
                arr[j] = temp;
            }
        }
        // Swap arr[idx] with arr[end]
        int temp = arr[idx];
        arr[idx] = arr[end];
        arr[end] = temp;

        return idx;
    }

    // QuickSort Function
    public static void QuickSort(arr, st, end) {
        if (st < end) {
            int pivotIdx = partition(arr, st, end);
            QuickSort(arr, st, pivIdx - 1); //Left Half
            QuickSort(arr, pivIdx + 1, end); //Right Half
            
        }
    }

    // Driver Function
    public static void main(String[] args) {
        int[] arr = { 12, 31, 35, 8, 32, 17 };
        QuickSort(arr, 0, arr.length() - 1);

        for (int val : arr) {
            System.out.print(" ");
        }
        System.out.println();
        return 0;
    }
}
