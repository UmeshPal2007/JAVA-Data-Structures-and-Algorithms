# Find the Smallest and Largest Element in an Array

## Real-World Applications
-   Price comparison
-   Stock market analysis
-   Shortest route, etc.

## Key Principles

-   Start with the first element as both `min` and `max`. This avoids
    comparing values with an arbitrary initial value such as infinity.
-   Update `min` when you find a smaller value.
-   Update `max` when you find a larger value.
-   Both values can be found in a single traversal; there is no need for
    two separate loops.

### Edge Cases

-   Empty array
-   Single-element array
-   Array in which all elements are the same

------------------------------------------------------------------------

## 1. Brute-Force / Naive Approach / Most Intuitive

1.  Sort the array in ascending order.
2.  The **smallest element** will be at index `0`.
3.  The **largest element** will be at index `arr.length - 1`.

### Complexity

-   **Time:** `O(n log n)` for a comparison-based sort.
-   **Space:** Depends on the sorting algorithm.

> Sorting the array is unnecessary if the only goal is to find its
> minimum and maximum.

------------------------------------------------------------------------

## 2. Optimal Approach --- Single Traversal

We can find both the smallest and largest elements in one pass through
the array.

### Finding the Smallest Element

1.  Create a variable called `min`.
2.  Initialize it with the first element of the array.
3.  Iterate through the remaining array elements using a loop.
4.  Compare each element with `min`.
5.  If the current element is smaller than `min`, update `min` with that
    element.
6.  After the loop finishes, `min` contains the smallest array value.

### Finding the Largest Element

1.  Create a variable called `max`.
2.  Initialize it with the first element of the array.
3.  Iterate through the array elements using a loop.
4.  Compare each element with `max`.
5.  If the current element is greater than `max`, update `max` with that
    element.
6.  After the loop finishes, `max` contains the largest array value.

### Finding Both Simultaneously

Instead of using separate loops, initialize both variables with the
first element and update them during the same traversal:

-   If `arr[i] < min`, update `min`.
-   If `arr[i] > max`, update `max`.

This finds both values in one traversal.
  Time                    `O(n)`                  Each array element is
                                                  visited once.

------------------------------------------------------------------------
## JAVA CODE
``` java
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

```

  Auxiliary Space         `O(1)`                  Only two variables
                                                  (`min` and `max`) are
                                                  used, regardless of
                                                  array size.
  -----------------------------------------------------------------------

### Key Takeaway

**Use a single traversal to find both the minimum and maximum
elements.** Initialize both variables with `arr[0]`, then update them
while iterating through the array.
