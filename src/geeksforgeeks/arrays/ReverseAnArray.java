package geeksforgeeks.arrays;

import java.util.Arrays;

public class ReverseAnArray {
    public static void main(String[] args) {
        int arr[] = {65, 89, 34};
        System.out.println("Before " + Arrays.toString(arr));
        System.out.println("After " + Arrays.toString(new ReverseAnArray().reverseArray(arr)));
    }

    public int[] reverseArray(int arr[]){
        int low = 0;
        int high = arr.length-1;
        while(low < high) {
            int temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;
            low++;
            high--;
        }
        return arr;
    }
}
