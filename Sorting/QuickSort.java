public class QuickSort {

    // Partition Function
    // All elements Smaller than Or equal to the pivot are moved To its left, and
    // all elements Greater are moved to its right.
    public static int partition(int[] arr, int st, int end) {
        int idx = st - 1; // idx tracks the boundary of elements smaller than or equal to the pivot.
        int pivot = arr[end]; // Choose the last element of the current subarray as the pivot.

        // Loop through the subarray from start to end-1
        for (int j = st; j < end; j++) {
            if (arr[j] <= pivot) { // Comparisions
                idx++; // Expand the region of smaller elements

                // Swap the Smaller element at 'j' with the element at 'idx'
                int temp = arr[idx];
                arr[idx] = arr[j];
                arr[j] = temp;
            }
        }

        // Places the pivot element At its Correct sorted position.
        idx++;
        int temp = arr[idx];
        arr[idx] = arr[end];
        arr[end] = temp;

        // Return the partitioning index
        return idx;
    }

    // QuickSort Function
    public static void quickSort(int[] arr, int st, int end) {
        if (st < end) { // Base case: Check if the subarray has more than one element.

            int pivotIdx = partition(arr, st, end); // Find the pivot index that elements are correctly partitioned.
            quickSort(arr, st, pivotIdx - 1); // Recursively sort the left subarray.
            quickSort(arr, pivotIdx + 1, end); // Recursively sort the right subarray.
        }
    }

    // Driver Function
    public static void main(String[] args) {
        int[] arr = { 12, 31, 35, 8, 32, 17 }; // Unsorted array

        System.out.println("Original array : " + java.util.Arrays.toString(arr));
        quickSort(arr, 0, arr.length - 1); // Call the quicksort function on the entire array
        System.out.println("Sorted array : " + java.util.Arrays.toString(arr));
    }
}
