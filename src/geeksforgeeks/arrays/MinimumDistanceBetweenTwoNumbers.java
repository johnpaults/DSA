package geeksforgeeks.arrays;

/* You are given an array A, of N elements.
    Find minimum index based distance between two elements of the array, x and y.
        Input:
        N = 4
        A[] = {1,2,3,2}
        x = 1, y = 2
        Output: 1
        Explanation: x = 1 and y = 2. There are
        two distances between x and y, which are
        1 and 3 out of which the least is 1. */

public class MinimumDistanceBetweenTwoNumbers {
    public static void main(String[] args) {
        int [] arr = {34, 45, 74, 21, 33, 34};
        System.out.println(findMinDis(6,arr,21, 34 ));
    }

    public static int findMinDis(int arrSize, int[] arr, int x, int y) {
        if(arrSize < 2 || arr.length < 2){
            return -1;
        }
        int ans = Integer.MAX_VALUE;
        int xVal = -1;
        int yVal = -1;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == x) {
                xVal = i;
                if(yVal != -1){
                    ans = Math.min(Math.abs(xVal - yVal), ans);
                }
            }
            if(arr[i] == y) {
                yVal = i;
                if(xVal != -1){
                    ans = Math.min(Math.abs(xVal - yVal), ans);
                }
            }
        }
        return ans == Integer.MAX_VALUE ? -1 : ans ;
    }
}
