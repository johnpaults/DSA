package geeksforgeeks.arrays;

import java.util.Arrays;

public class MoveZerosToEnd {
    public static void main(String[] args) {
        int arr[] = {34,54,9,0,0,5,6,0,34,8,0,0,0,56,0};
        System.out.println(Arrays.toString(new MoveZerosToEnd().moveZerosToEnd(arr)));
    }

    public int[] moveZerosToEnd (int arr[]) {
        int lastNonZero = 0;
        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i] != 0){
                if(lastNonZero == 0){
                    lastNonZero = i;
                }
                int temp = arr[i];
                lastNonZero++;
                arr[lastNonZero] = temp;
                arr[i] = 0;
            }
        }
        return arr;
    }
}
