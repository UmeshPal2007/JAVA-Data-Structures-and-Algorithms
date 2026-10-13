// LEETCODE 53 : Maximum Subarray Sum using Kadane's Algorithm

//You are given an integer array nums.
// Your task is to find a non empty contiguous subarray that has the largest possible sum and return that sum.
// Sub-array is a contiguous portion of an array. Contiguous means the elements must be next to each other. You cannot skip elements.
// Among all possible contiguous subarrays, you have to find the one whose sum is greatest.

class Solution {
    public int maxSubArray(int[] nums) {
        int currentSum = 0; // Current subarray sum
        int maxSum = Integer.MIN_VALUE; // Maximum sum found

        for(int val: nums) {
            currentSum += val; // Add current element in the running sum
            maxSum = Math.max(currentSum, maxSum); // Update the maximum subarray BEFORE resetting current sum, So that negative elements are handled correctly. 

            // Kadane's Algorithm : Reset negative running sum to 0 So the next element can start a new subarray. Reset the running sum If it becomes negative.
            if(currentSum < 0) {
                currentSum = 0;
            }
        }
        return maxSum; // Return maximum Sum (largest Contiguous subarray sum found)
    }
}

// Time: O(n) | Space: O(1)