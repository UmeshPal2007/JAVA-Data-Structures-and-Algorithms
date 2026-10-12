// LeetCode 33. Search in Rotated Sorted Array
// BINARY SEARCH ALGORITHM is a searching algorithm that operates on a sorted Or monotonic search space, repeatedly dividing it into halves to find a target value or optimal answer in logarithmic time O(log N).
// You are given an integer array nums with distinct elements sorted in ascending order And then rotated. The Array was originally sorted but then rotated at some pivot. You must return the index of target, or -1 if the target doesn't exist.
// Important observation is that on every Binary search step at least one half of the current search range is sorted.

class Solution {
    public int search(int[] nums, int target) {
        int start = 0; // 📍 Pointer at start
        int end = nums.length - 1; // 📍 Pointer at end

        // As long as (start <= end) there are still elements to examine. When (start > end), The search range is empty And the target was not found.

        while (start <= end) { // 🎯 Find middle index
            int mid = start + (end - start) / 2;

            if (nums[mid] == target) { // If the middle element equals to the Target. 🎉 Target found!.
                return mid;
            }

            // 🔍 Check if the left half is sorted
            if (nums[start] <= nums[mid]) {
                // Check if target lies within the sorted left half
                if (nums[start] <= target && target < nums[mid]) {
                    end = mid - 1; //⬅️ Search left
                } else {
                    start = mid + 1; // ➡️ Search right
                }
            } 
            // Otherwise, the right half must be sorted
            else {
                // Check if target lies within the sorted right half
                if (nums[mid] < target && target <= nums[end]) {
                    start = mid + 1; // ➡️ Search right
                } else {
                    end = mid - 1; // ⬅️ Search left
                }
            }
        }
        return -1; // ❌ Target not found
    }
}

// Time Complexity : O(log n)- Each iteration eliminates roughly half of the remaining search range.
// Space complexity : O(1)- We use only a few variables without creating another array.
