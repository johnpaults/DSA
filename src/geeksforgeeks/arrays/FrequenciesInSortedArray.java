package geeksforgeeks.arrays;

public class FrequenciesInSortedArray {
    public static void main(String[] args) {
        int[] arr = {2,2,3};
        new FrequenciesInSortedArray().printFrequesncies(arr);
    }

    private void printFrequesncies(int[] arr){
        int frequency = 1;
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] != arr[i-1]){
                System.out.println(arr[i-1] + ": " + (frequency));
                frequency = 0;
            }
            frequency++;
        }
        if(arr.length != 0){
            System.out.println(arr[arr.length-1] + ": " + (frequency == 0 ? (frequency+1) : frequency));
        }
    }
}
