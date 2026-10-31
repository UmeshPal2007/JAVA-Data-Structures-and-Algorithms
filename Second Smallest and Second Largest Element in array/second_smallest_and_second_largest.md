# Find the Second Smallest and Second Largest Element in an Array


## 1. Brute Force / Naive Approach

### Steps

1. Sort the array in ascending order.
2. The element at index `1` is the second smallest element.
3. The element at index `length - 2` is the second largest element.

### Complexity analysis

- **Time Complexity:** `O(N log N)` — sorting dominates the runtime.
- **Space Complexity:** Depends on the sorting implementation; it may be `O(1)` auxiliary space or `O(N)`.

### Why this approach is inefficient

We only need two values, but sorting arranges the entire array. We can solve the problem in one traversal without sorting.

---

## 2. Optimal Approach — Single Traversal

Track four values simultaneously:

| Variable | Meaning |
|---|---|
| `small` | Smallest element found so far |
| `secondSmall` | Second smallest distinct element found so far |
| `large` | Largest element found so far |
| `secondLarge` | Second largest distinct element found so far |

### Initialization

- Initialize `small` and `secondSmall` to `Integer.MAX_VALUE`.
- Initialize `large` and `secondLarge` to `Integer.MIN_VALUE`.

These initial values allow the first valid array element to update the variables.

### A. Second Smallest Algorithm

For every element `arr[i]`:

1. If `arr[i] < small`:
   - The old `small` becomes `secondSmall`.
   - Update `small` to `arr[i]`.
2. Otherwise, if `arr[i] < secondSmall` **and** `arr[i] != small`:
   - Update `secondSmall` to `arr[i]`.

After traversing the array, `secondSmall` stores the second smallest distinct element.

### B. Second Largest Algorithm

For every element `arr[i]`:

1. If `arr[i] > large`:
   - The old `large` becomes `secondLarge`.
   - Update `large` to `arr[i]`.
2. Otherwise, if `arr[i] > secondLarge` **and** `arr[i] != large`:
   - Update `secondLarge` to `arr[i]`.

After traversing the array, `secondLarge` stores the second largest distinct element.

### Why do we check `arr[i] != small` and `arr[i] != large`?

This prevents duplicate minimum or maximum values from being treated as the second distinct value.

---


> **Implementation note:** The checks above use `Integer.MAX_VALUE` and `Integer.MIN_VALUE` as initialization markers. If an array can contain those exact boundary values, a separate “found” flag or a different return design is needed to distinguish a real value from an uninitialized marker.

---

## 4. JAVA CODE

```java
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
```

### Output

```text
Second smallest is 2
Second largest is 5
```

---

## 5. Complexity Analysis — Optimal Approach

Both functions traverse the array once.

| Complexity | Value | Reason |
|---|---|---|
| Time Complexity | `O(N)` | Each function performs one linear traversal. |
| Auxiliary Space Complexity | `O(1)` | Only a fixed number of variables are used. |

The two functions together still take `O(N) + O(N) = O(2N)`, which simplifies to **`O(N)`**.

---

## 6. Key Interview Takeaways

- Avoid sorting when only the second smallest and second largest values are required.
- Maintain the smallest and second smallest values together.
- Maintain the largest and second largest values together.
- Update the second value before replacing the current smallest or largest.
- Handle duplicates when the problem asks for the second **distinct** element.
- Consider edge cases: fewer than two elements, all elements equal, and arrays with duplicate minimum or maximum values.
- Look for opportunities to combine traversals. Both answers can also be found in one shared loop.

