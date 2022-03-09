package geeksforgeeks.arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class LeftRotateArrayByD {
    public static void main(String[] args) {
        int[] arr = {4,6,7,8,9};
        System.out.println(Arrays.toString(new LeftRotateArrayByD().rotateArray(arr, 3)));
    }

    public int[] rotateArray(int [] arr, int d){
        Map<Integer, Integer> temp = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if(i < d){
                temp.put(i, arr[i]);
            } else {
                arr[i-d] = arr[i];
            }
        }

        for (int i = arr.length - d; i < arr.length; i++) {
            arr[i] = temp.get(Integer.valueOf(i -arr.length + d));
        }
        return arr;
    }
}
