class Solution {
    public static void mergeSort(int arr[], int st, int end) { // MergeSort (Recursive Function) divides the array into smaller sub-problems.
        if (st < end) { // Base Condition : Ensures recursion stops when a subarray has a length of 1 or 0 (which is naturally sorted).
            int mid = st + (end - st) / 2; // Finds the middle index without risking integer overflow.

            // Recursive Divide Calls
            mergeSort(arr, st, mid); // Left Half
            mergeSort(arr, mid + 1, end); // Right Half

            merge(arr, st, mid, end); // Conquer Step: Calls merge() to stitch the two sorted halves back together.
        }
    }

    public static void merge(int arr[], int st, int mid, int end) { // Helper function to merge two sorted halves: arr[st -- mid] and arr[mid+1 -- end] into a single sorted subarray.
        int[] temp = new int[end - st + 1]; // Temporary array sized precisely for the current sub-range

        int i = st; // Pointer for Left Half
        int j = mid + 1; // Pointer for Right Half
        int index = 0; // Pointer for temp array

        // Compare elements from both halves and copy the smaller one
        while (i <= mid && j <= end) {
            if (arr[i] <= arr[j]) {
                temp[index++] = arr[i++];
            } else {
                temp[index++] = arr[j++];
            }
        }

        // Copy any remaining elements from the left half
        while (i <= mid) {
            temp[index++] = arr[i++];
        }

        // Copy any remaining elements from the right half
        while (j <= end) {
            temp[index++] = arr[j++];
        }

        // Copy elements back from temp array to the original array
        for (int idx = 0; idx < temp.length; idx++) {
            arr[st + idx] = temp[idx];
        }
    }

    // Driver Code
    public static void main(String[] args) {
        int arr[] = { 38, 27, 43, 10, 3, 9, 82, 10 };

        System.out.print("Original Array: ");
        printArray(arr);

        mergeSort(arr, 0, arr.length - 1); //Call mergeSort

        System.out.print("Sorted Array:   ");
        printArray(arr);
    }

    // Helper method to display array elements
    public static void printArray(int arr[]) {
        for (int val : arr) {
            System.out.print(val + " ");
        }
        System.out.println();
    }
}