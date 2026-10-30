public class Solution {
    public static void findMinMax(int[] arr) { // Function to find the smallest and largest elements.

        // Handle the edge case of a null or empty array.
        if (arr == null || arr.length == 0) {
            System.out.println("Array is empty or invalid for this operation.");
            return;
        }

        // Initialize min and max with the first array element is generally preferred rather than Smallest or Largest Infinity because it ensures that you get the actual elements that exist within dataset.
        int min = arr[0];
        int max = arr[0];

        // Traverse the array to find the smallest and largest elements.
        for (int i = 0; i < arr.length; i++) {

            // If the current element is smaller than min, update min.
            if (arr[i] < min) {
                min = arr[i];
            }

            // If the current element is greater than max, update max.
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        // Print the smallest and largest elements.
        System.out.println("Smallest: " + min + ", Largest: " + max);
    }
}
