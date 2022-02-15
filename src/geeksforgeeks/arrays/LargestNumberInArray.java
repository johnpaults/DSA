package geeksforgeeks.arrays;

import java.util.Arrays;

public class LargestNumberInArray {
    public static void main(String[] args) {
        int arr[] = {232, 454, 234, 874};
        System.out.println("largest = " + new LargestNumberInArray().findLargest(arr));
        int arr2[] = {10, 111, 190, 10};
        System.out.println("args = " + new LargestNumberInArray().secondLargest(arr2));
    }

    public int findLargest(int arr[]){
        int ans = -1;
        for (int i = 0; i < arr.length; i++) {
          if(arr[i] > ans)
              ans = i;
        }
        return ans;
    }

    public int secondLargest(int arr[]){
        int ans = -1;
        int largest = 0;
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] > arr[largest]) {
                ans = largest;
                largest = i;
            } else {
                if(arr[i] != arr[largest]){
                    if(ans == -1 || arr[ans] < arr[i]){
                        ans = i;
                    }
                }
            }
        }
        return ans;
    }
}
