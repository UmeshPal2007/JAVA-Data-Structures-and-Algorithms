# Check if an Array Is Sorted

## Problem Statement

Given an array, check whether it is sorted in **ascending
(non-decreasing) order**.

-   If the array is sorted, return `true`.
-   Otherwise, return `false`.

An array is sorted in non-decreasing order when every element is greater
than or equal to the element before it.

------------------------------------------------------------------------

## 1. Brute Force Approach

### Intuition

The idea is to start with the element at index `0` and compare it with
all the elements that come after it.

-   If the selected element is smaller than or equal to all its future
    elements, move to the next index. Continue this process until the entire array has been traversed.
-   If a selected element is greater than any element that comes after
    it, the array is not sorted, so return `false`.
-   If the entire array is traversed successfully, return `true`.

> **Note:** This approach checks every element against all its future
> elements. The optimal approach below only needs to compare adjacent
> elements.

------------------------------------------------------------------------

## 2. Optimal Approach

### Intuition

In a sorted array, every element must be greater than or equal to its
previous element.

Therefore, we only need to compare each element with the element
immediately before it.

-   Start checking from index `1`, because index `0` has no previous
    element.
-   If `arr[i] < arr[i - 1]`, the current element is smaller than the
    previous element. This violates ascending order, so return `false`.
-   Otherwise, continue to the next element.
-   If the loop finishes without finding any violation, return `true`.

### Java Code

``` java
class Solution {
    public boolean isSorted(int[] arr, int n) {

        // Start from index 1 to compare each element with its previous element.
        for (int i = 1; i < n; i++) {

            // If the current element is smaller than the previous element,
            // the array is not sorted.
            if (arr[i] < arr[i - 1]) {
                return false;
            }
        }

        // If no violation is found, the array is sorted.
        return true;
    }
}

public class Main {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};
        int n = arr.length;

        Solution obj = new Solution();

        // Print the result returned by isSorted().
        System.out.println(obj.isSorted(arr, n) ? "True" : "False");
    }
}
```
## 3. Complexity Analysis

### Time Complexity: `O(N)`

We compare each adjacent pair once in a single traversal of the array.
In the worst case, all `N - 1` comparisons are performed.

### Space Complexity: `O(1)`

The algorithm uses only a constant amount of extra space, regardless of
the input array size.
