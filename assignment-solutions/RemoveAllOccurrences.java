package assignment_solutions;

/**
 * Problem:
 * Remove all occurrences of a given value from an array.
 *
 * Important Note:
 * - Arrays in Java have fixed size.
 * - We remove elements by shifting and keep track of the logical size.
 *
 * Example:
 * Input:  [3, 1, 3, 4, 3, 5], key = 3
 * Output: [1, 4, 5]
 *
 * Approach:
 * - Traverse the array
 * - When the target element is found:
 *   - Shift all following elements one position left
 *   - Reduce logical size
 *   - Re-check the current index
 *
 * Time Complexity: O(n²) in worst case (due to shifting)
 * Space Complexity: O(1)
 */
public class RemoveAllOccurrences {

    /**
     * Removes all occurrences of key and returns the new logical size.
     */
    public static int removeOccurrences(int[] arr, int key) {

        int size = arr.length;

        for (int i = 0; i < size; i++) {

            if (arr[i] == key) {

                // Shift elements to the left
                for (int j = i; j < size - 1; j++) {
                    arr[j] = arr[j + 1];
                }

                size--; // Reduce logical size
                i--;    // Stay at same index to check shifted value
            }
        }

        return size;
    }

    public static void main(String[] args) {

        int[] arr = {3, 1, 3, 4, 3, 5};
        int newSize = removeOccurrences(arr, 3);

        // Print only the valid part of the array
        for (int i = 0; i < newSize; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
