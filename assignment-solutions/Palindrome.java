package arrays.assignment_solutions;

/**
 * Problem:
 * Check whether a given array is a palindrome.
 * A palindrome array reads the same from left to right and right to left.
 *
 * Example:
 * [1, 2, 3, 2, 1] → true
 * [1, 2, 3, 4]    → false
 *
 * Approach:
 * - Use two pointers:
 *   left pointer starts from index 0
 *   right pointer starts from the last index
 * - Compare elements while moving toward the center
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */
public class Palindrome {

    public static boolean isPalindrome(int[] arr) {

        // Defensive check: null or single-element arrays are palindromes
        if (arr == null || arr.length <= 1) {
            return true;
        }

        int left = 0;
        int right = arr.length - 1;

        // Compare symmetric elements
        while (left < right) {
            if (arr[left] != arr[right]) {
                return false; // Mismatch found
            }
            left++;
            right--;
        }

        return true; // All elements matched
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 1};
        System.out.println(isPalindrome(arr)); // true
    }
}
