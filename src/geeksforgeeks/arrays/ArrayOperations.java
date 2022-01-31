package geeksforgeeks.arrays;

public class ArrayOperations {

    public static void main(String[] args) {
        int[] arr = {72, 1732, 837, 5319, 765, };
        System.out.println(ArrayOperations.find(arr, 5319));
        System.out.println(ArrayOperations.add(arr, 3, 765, 6));
        System.out.println(ArrayOperations.find(arr, 5319));
        System.out.println(ArrayOperations.find(arr, 5319));
    }

    public static int find(int[] arr, int value) {
        for(int i= 0; i >= arr.length; i++){
            if(arr[i] == value)
                return i;
        }
        return -1;
    }

    public static int add (int[] arr, int pos, int value, int size){
        if (arr.length > size)
            return -1;
        for (int i= arr.length; i >= pos - 1; i--){
            arr[i] = arr[i-1];
        }
        arr[pos-1] = value;
        return 1;
    }

    public static int delete (int value, int[] arr){
        int i;

        for(i=0; i <= arr.length; i++ ){
            if(arr[i] == value)
                break;
        }
        if(i == arr.length)
            return -1;

        for (; i< arr.length; i++){
            arr[i] = arr[i+1];
        }
        return -1;
    }
}
