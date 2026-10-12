// LeetCode 33. Search in Rotated Sorted Array
// BINARY SEARCH ALGORITHM is a searching algorithm that operates on a sorted Or monotonic search space, repeatedly dividing it into halves to find a target value or optimal answer in logarithmic time O(log N).
// You are given an integer array nums with distinct elements sorted in ascending order And then rotated. The Array was originally sorted but then rotated at some pivot. You must return the index of target, or -1 if the target doesn't exist.
// Important observation is that on every Binary search step at least one half of the current search range is sorted.

class Solution {
    public int search(int[] nums, int target) {
        int start = 0; // Start Pointer points at the first index
        int end = nums.length - 1; // End pointer points at the last valid index.

        // As long as (start <= end) there are still elements to examine. When (start > end), The search range is empty And the target was not found.
        while (start <= end) {
            int mid = start + (end - start) / 2; // Calculating the middle index of the current search range.

            // If the middle element equals to the Target, we've found the answer. Return
            // its Index immediately.
            if (nums[mid] == target) {
                return mid;
            }

            // If nums[start] <= nums[mid] then the left Half is sorted.
            if (nums[start] <= nums[mid]) {
                if (nums[start] <= target && target < nums[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (nums[mid] < target && target <= nums[end]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        return -1;
    }
}

// Time Complexity : O(log n)- Each iteration eliminates roughly half of the remaining search range.
// Space complexity : O(1)- We use only a few variables without creating another array.
