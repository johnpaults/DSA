package geeksforgeeks.mathematics;

public class TrailingZerosOfFactorials {
    public int findTailingZeroOfFact (int num) {
        double fact = new Factorials().findFact(num);
        System.out.println(" TrailingZerosOfFactorials : Factorials of " + num + " is " + fact);
        return this.noOfTrailingZero(fact);
    }
    private int noOfTrailingZero (double num) {
        int x = 0;
        while (num % 10 == 0) {
            x++;
            num = num / 10;
        }
        return x;
    }
}
