LeetCode aur data structures & algorithms (DSA) mein Two Pointers ke problems ko main 4 bade patterns mein divide kiya jata hai. Agar aap ye chaar patterns seekh lete hain, toh Two Pointers ke lagbhag saare questions solve ho jayenge.
Yahan complete breakdown hai:

1. Opposite Direction (Opposing Pointers) ======================================================
Is pattern mein ek pointer shuruat (left = 0) se shuru hota hai aur dusra pointer aakhiri (right = n-1) se. Dono ek dusre ki taraf badhte hain jab tak ki wo beech mein na mil jayein.
• Kab use karein? Jab array sorted ho, ya hume dono ends se elements ko compare/swap karna ho.
• Popular Questions:
    • 125 - Valid Palindrome
	• 167 - Two Sum II (Input array is sorted)
	• 11 - Container With Most Water
	• 15 - 3Sum
    • 16 - 3Sum Closest
    • 42 - Trapping Rain Water
    • 344 - Reverse String
    • 977 - Squares of a Sorted Array

2. Same Direction (Fast & Slow / Sliding Window) ===================================================
Isme dono pointers ek hi direction mein chalte hain (left se right), lekin ek pointer dusre se tez chalta hai. Isko do sub-patterns mein baanta jata hai:
• Fast and Slow (Tortoise and Hare): Ek pointer 1 step leta hai aur dusra 2 steps.
	• Kab use karein? Linked List mein cycle detect karne ya middle element dhundhne ke liye.
	• Questions:
    • 26 Remove Duplicates from Sorted Array
    • 80 Remove Duplicates from Sorted Array II
    • 27 Remove Element
    • 283 Move Zeroes
    • 141 Linked List Cycle
    • 876 Middle of the Linked List
    • 443 String Compression

• Sliding Window: Dono pointers ke beech ka gap chhota ya bada hota hai ek specific condition ke hisab se (Dynamic or Fixed window).
	• Kab use karein? Subarray ya substring se jude problems mein.
	• Questions: 
    • 3 Longest Substring Without Repeating Characters 
    • 643 Maximum Average Subarray
    • 209 Minimum Size Subarray Sum
    • 1004 Max Consecutive Ones III
    • 438 Find all Anagrams in a string
    • 76 Minimum Window Substring

3. Two Arrays / Two Linked Lists (Merge Pattern) =====================================================
Is pattern mein do alag-alag arrays ya lists hoti hain. Ek pointer pehle array (p1 = 0) par hota hai aur dusra pointer dusre array (p2 = 0) par. Hum dono pointers ko unki values compare karke aage badhate hain.
• Kab use karein? Jab do sorted arrays ko merge karna ho ya unka intersection/union nikalna ho.
• Popular Questions:
	• 88 Merge Sorted Array
    • 21 Merge Two Sorted Lists
    • 392 Is Subsequence
    • 349 Intersection of Two Arrays I
	• 350 Intersection of Two Arrays II
    • 160 Intersection of Two Linked Lists
    • 986 Interval List Intersections

4. Split / Partition Pattern (Array Transformation) ===================================================
Isme dono pointers ek hi array mein zero se shuru hote hain. Ek pointer loop chalane (explore karne) ke liye hota hai aur dusra pointer valid ya desired elements ki position ko maintain karne ke liye.
• Kab use karein? Jab array ke elements ko in-place modify ya rearrange karna ho (bina extra space ke).
• Popular Questions:
	• 905 Sort array by Parity
	• 283 Move Zeroes
	• 27 Remove Element
    • 86 Partition List
    • 75 Sort Colors