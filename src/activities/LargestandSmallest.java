/**
 * Problem: Find the largest and smallest elements in an array, 
 * along with the indices where they appear.
 *
 * This activity reinforces:
 * - Array traversal using a single loop (O(n))
 * - Comparing elements to track max/min values
 * - Understanding how indices map to positions in memory
 *
 * Input example:  [4, 9, -3, 7, 1]
 * Output example:
 *   Largest element: 9 at index 1
 *   Smallest element: -3 at index 2
 *
 * This problem was given at the end of Lecture 01 – Arrays.
 */
package activities;

/**
 *
 * @author Maryam
 */
public class LargestandSmallest {
    
    public static void findLargestandSmallest(int arr[]){
        int largest = arr[0];
        int smallest = arr[0];
        int largestIndex = 0;
        int smallestIndex = 0;
        
        for(int i = 1; i < arr.length; i++){
            if(arr[i] > largest){
                largest = arr[i];
                largestIndex = i;
            }
            
            if(arr[i] < smallest){
                smallest = arr[i];
                smallestIndex = i;
            }
        }
        
        System.out.println("Largest element: " + largest +" at index: " + largestIndex);
        System.out.println("Smallest element: " + smallest +" at index: " + smallestIndex);
    }
    
    public static void main(String[] args) {
        int arr [] = {4, 9, -3, 7, 1};
        
        findLargestandSmallest(arr);
    }
}
