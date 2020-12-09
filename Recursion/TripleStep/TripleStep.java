import java.util.Arrays;

public class TripleStep {

    /**
     * ? Implement a method to count how many possible ways the child can run up the stairs.
     * ? child can hop either 1 step, 2 steps, or 3 steps at a time.
     */

    // * Brute-force solution with O (3n)
    public static int countWays(int n) {
        if (n < 0) return 0;
        else if (n == 0) return 1;
        else return countWays(n-1) + countWays(n-2) + countWays(n-3);
         }

    // * Memorization solution
    public static int countwaysM(int n){
        int[] memo = new int[n+1];
        Arrays.fill(memo, -1);
        return countwaysM(n , memo);
    }

    public static int countwaysM(int n, int[] memo) {
        if (n < 0) return 0;
        else if (n == 0) return 1;
        else if (memo[n]> -1) return memo[n];
        else {
            memo[n] = countwaysM(n-1, memo) + countwaysM(n-2, memo) + countwaysM(n-3, memo);
            return memo[n];
        }
    }

    public static void main(String[] args) {
        System.out.println("Number of ways -> " + countWays(3));
        System.out.println("Number of ways -> " + countwaysM(8));
    }
    
}
