package geeksforgeeks.arrays;

public class LeadersInArray {
    public static void main(String[] args) {
        int[] arr = {2,3,5,7,9};
        new LeadersInArray().printLeaders(arr);
    }

    public void printLeaders(int[] arr){
        if(arr.length > 0){
            System.out.print(arr[arr.length-1]);
            int currLead = arr[arr.length-1];
            for (int i = arr.length-1; i >= 0; i--) {
                if(arr[i] < currLead){
                    System.out.print("," + arr[i]);
                }
            }
        }
    }
}
