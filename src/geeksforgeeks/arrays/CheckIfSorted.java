package geeksforgeeks.arrays;

import java.util.Arrays;

public class CheckIfSorted {
    public static void main(String[] args) {
        int arr[] = {463, 543 };
        System.out.println("isSorted = " + new CheckIfSorted().isSorted(arr));
    }

    boolean isSorted(int arr[]){
        if(arr.length < 2)
            return false;
        for (int i = 0; i < arr.length-1 ; i++) {
            if(arr[i] > arr[i+1]){
                return false;
            }
        }
        return true;
    }
}
