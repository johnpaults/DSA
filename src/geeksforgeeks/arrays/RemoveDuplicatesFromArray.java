package geeksforgeeks.arrays;

import java.util.Arrays;

public class RemoveDuplicatesFromArray {
    public static void main(String[] args) {
        int arr[] = {3,4,4,5,6,6,6,7,8,8,8,9};
        System.out.println("Remove duplicates in sorted Array " + Arrays.toString(arr));
        System.out.println("After " + Arrays.toString(new RemoveDuplicatesFromArray().removeDuplicates(arr)));
    }

    public int[] removeDuplicates(int[] arr){
        int res = 1;
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] != arr[res-1]) {
                arr[res] = arr[i];
                res++;
            }
        }
        return arr;
    }
}
