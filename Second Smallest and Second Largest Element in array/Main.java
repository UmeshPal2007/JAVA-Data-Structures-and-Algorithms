class Solution {

    // Function to find the SECOND SMALLEST distinct element.
    public static int secondSmallest(int[] arr, int n) {

        if (n < 2) {
            throw new IllegalArgumentException(
                    "At least two elements are required.");
        }

        int small = Integer.MAX_VALUE;
        int secondSmall = Integer.MAX_VALUE;

        // Traverse the array to find the second smallest element.
        for (int i = 0; i < n; i++) {

            // Update the smallest and second smallest values.
            if (arr[i] < small) {
                secondSmall = small;
                small = arr[i];
            }

            // Update only if the current value is distinct from the smallest.
            else if (arr[i] < secondSmall && arr[i] != small) {
                secondSmall = arr[i];
            }
        }

        if (secondSmall == Integer.MAX_VALUE) {
            throw new IllegalArgumentException(
                    "A second distinct smallest element does not exist.");
        }

        return secondSmall;
    }

    // Function to find the SECOND LARGEST distinct element.
    public static int secondLargest(int[] arr, int n) {

        if (n < 2) {
            throw new IllegalArgumentException(
                    "At least two elements are required.");
        }

        int large = Integer.MIN_VALUE;
        int secondLarge = Integer.MIN_VALUE;

        // Traverse the array to find the second largest element.
        for (int i = 0; i < n; i++) {

            // Update the largest and second largest values.
            if (arr[i] > large) {
                secondLarge = large;
                large = arr[i];
            }

            // Update only if the current value is distinct from the largest.
            else if (arr[i] > secondLarge && arr[i] != large) {
                secondLarge = arr[i];
            }
        }

        if (secondLarge == Integer.MIN_VALUE) {
            throw new IllegalArgumentException(
                    "A second distinct largest element does not exist.");
        }

        return secondLarge;
    }
}

// MAIN FUNCTION
public class Main {

    public static void main(String[] args) {

        int[] arr = { 1, 2, 4, 7, 7, 5 };
        int n = arr.length;

        int sS = Solution.secondSmallest(arr, n);
        int sL = Solution.secondLargest(arr, n);

        System.out.println("Second smallest is " + sS);
        System.out.println("Second largest is " + sL);
    }
}