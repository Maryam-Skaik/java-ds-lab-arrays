/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays;

/**
 *
 * @author Maryam
 */
public class Arrays {
    
    public static int [] insertElement(int arr[], int element, int index, int size){
        
        if(size == arr.length){
            System.out.println("Array is full");
            return arr;
        }
        
        if(index < 0 || index >= arr.length){
            System.out.println("Invalid index");
            return arr;
        }
        
        for(int i = size; i > index; i--){
            arr[i] = arr[i - 1];
        }
        
        arr[index] = element;
        
        return arr;
    }
    
    public static int[] deleteElement(int arr[], int index, int size){
        
        if(index < 0 || index >= arr.length){
            System.out.println("Invalid index");
            return arr;
        }
        
        for(int i = index; i < size; i ++){
            arr[i] = arr[i + 1];
        }
        return arr;
    }
    
    public static void main(String[] args) {
        int arr[] = new int [5];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 5;
        
        for(int i: arr){
            System.out.print(i + " ");
        }
        
        System.out.println("");
        
        insertElement(arr, 7, 1, 3);
        
        for(int i: arr){
            System.out.print(i + " ");
        }
        
        System.out.println("");
        
        deleteElement(arr, 1, 4);
        
        for(int i: arr){
            System.out.print(i + " ");
        }
        
        System.out.println("");
    }
}