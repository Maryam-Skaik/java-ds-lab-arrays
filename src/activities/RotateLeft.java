
package activities;

/**
 * Problem: Rotate an array to the left.
 *
 * This file includes three related methods:
 *
 * 1) rotateLeft(arr, k):
 *    - Rotates the array left by k positions using repeated shifting.
 *    - Uses deleteElement() to simulate left-shifting, exactly as taught 
 *      in Lecture 01 – Arrays.
 *
 * 2) rotateLeft by 1 (concept inside rotateLeft):
 *    - Demonstrates shifting elements left once and moving the first element
 *      to the end.
 *    - Directly reinforces the lecture's deletion-with-shifting logic.
 *
 * 3) rotateByReverse(arr, k):
 *    - An advanced O(n) rotation method using the reversal technique.
 *    - Included for students who want to explore faster approaches,
 *      but not required in the lecture activity.
 *
 * These solutions allow students to practice:
 * - Manual left shifting
 * - Index manipulation
 * - Writing array operations without helper libraries
 */
/**
 *
 * @author Maryam
 */
public class RotateLeft {

    /**
     * Simulate deleting element at index by shifting elements left.
     * After shifting, the last logical position is set to 0.
     *
     * @param arr array to modify
     * @param index position to delete (0-based)
     * @param size logical size (usually arr.length if all slots are used)
     * @return arr (modified in-place)
     */
    public static int[] deleteElement(int arr[], int index, int size){
        
        if(index < 0 || index >= arr.length){
            System.out.println("Invalid index");
            return arr;
        }

         // Shift elements left from deleted index
        for(int i = index; i < size - 1; i ++){
            arr[i] = arr[i + 1];
        }

        // Clear last logical element
        arr[size - 1] = 0;
        return arr;
    }

    /**
     * Rotate array left by k positions using repeated left-shift.
     * This uses deleteElement to illustrate shifting behaviour taught in lecture.
     *
     * Complexity: O(n * k) in worst case.
     *
     * @param arr array to rotate (modified in-place)
     * @param k number of left rotations
     */
    public static void rotateLeft(int arr[], int k){
        k %= arr.length; // reduce unnecessary rotations
        
        for(int i = 0; i < k; i++){
            // Save first element before shifting (otherwise it's lost)
            int temp = arr[0];

            // Shift left by one (simulate deletion at index 0)
            deleteElement(arr, 0, arr.length);

            // Place saved first element at the end
            arr[arr.length - 1] = temp;
            
        }
    }

    /**
     * Reverse a subarray in-place from index l to r (inclusive).
     */
    public static void reverseArray(int arr[], int l, int r){
        
        while(l < r){
            int temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
            l++; r--;
        }
    }

     /**
     * Rotate array left by k using the reversal algorithm (O(n)).
     * Steps:
     *   1) reverse first k elements
     *   2) reverse remaining n-k elements
     *   3) reverse whole array
     *
     * This is included as an advanced (efficient) technique.
     */
    public static void rotateByReverse(int arr[], int k){
        k %= arr.length; 
        
        reverseArray(arr, 0, k - 1);
        reverseArray(arr, k, arr.length - 1);
        reverseArray(arr, 0, arr.length - 1);
        
    }
    
    public static void main(String[] args) {
        int arr[] = {10, 20, 30, 40, 50};
        
        for(int i: arr){
            System.out.print(i + " ");
        }
        
        System.out.println("");
        
        rotateLeft(arr, 6);
        
        for(int i: arr){
            System.out.print(i + " ");
        }
        
        System.out.println("");
        
        rotateByReverse(arr, 7);
        
        for(int i: arr){
            System.out.print(i + " ");
        }
        
        System.out.println("");
    }
}
