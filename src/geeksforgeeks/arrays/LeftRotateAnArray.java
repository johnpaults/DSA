package geeksforgeeks.arrays;

import java.util.Arrays;

public class LeftRotateAnArray {
    public static void main(String[] args) {
        int[] arr = {3,4,5,6,7,8};
        System.out.println(Arrays.toString(new LeftRotateAnArray().leftRotate(arr)));
    }

    public int[] leftRotate(int[] arr){
        if(arr.length > 0){
            int temp = arr[0];
            for (int i = 1; i < arr.length; i++)
                arr[i-1] = arr[i];
            arr[arr.length-1] = temp;
        }
        return arr;
    }
}
