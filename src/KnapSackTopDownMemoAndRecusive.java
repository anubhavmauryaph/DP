import java.util.Arrays;

public class KnapSackTopDownMemoAndRecusive {
    // for memoization create a table of [length+1][weight+1] dimension array.
    static int[][] tabel;
    
    
    // KnapSackWithMemoisation : kswm
    public static int kswm(int[] wt, int[] val, int weight, int length) {
        // Base case: if no items are left or weight is 0
        if (length == 0 || weight == 0) {
            return 0;
        }
        
        // If value is already computed
        if (tabel[length][weight] != -1) {
            return tabel[length][weight];
        }
        
        // If weight of the nth item is less than or equal to the remaining capacity
        if (wt[length - 1] <= weight) {
            tabel[length][weight] = Math.max(
                val[length - 1] + kswm(wt, val, weight - wt[length - 1], length - 1),
                kswm(wt, val, weight, length - 1)
            );
            return tabel[length][weight];
        } else {
            // If weight of the nth item is greater than the remaining capacity
            tabel[length][weight] = kswm(wt, val, weight, length - 1);
            return tabel[length][weight];
        }
    }
    
    public static void main(String[] args) {
        int profit[] = { 1, 2, 3 };
        int wt[] = { 4, 5, 1 };
        int length = profit.length; // Number of items
        int weight = 4; // Capacity of the knapsack
        
        tabel = new int[length+1][weight+1];
        for (int[] row : tabel) {
            // Fill the memoization table with -1
            Arrays.fill(row, -1); 
        }
        System.out.println(kswm(wt, profit, weight, length));
    }
}
