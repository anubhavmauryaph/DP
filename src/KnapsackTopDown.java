import java.util.Arrays;

public class KnapsackTopDown {
        
    static int[][] tabel;

    static {
        // Initialize the table for memoization
        tabel = new int[4][5];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                if (i==0 || j == 0) {
                    tabel[i][j] = 0;
                }
            }
        }
    }
    public static int kstpdwn(int[] wt, int[] val, int weight, int length){
        if (wt[length-1]<= weight) {
            
            tabel[length][weight] = Math.max(val[length-1]+tabel[length-1][weight-wt[length-1]], tabel[length-1][weight]);

            return tabel[length][weight];
        }
        tabel[length][weight] = tabel[length-1][weight];
        return tabel[length][weight];

    }
    public static void main(String[] args) {
        int profit[] = { 1, 2, 3 };
        int weight[] = { 4, 5, 1 };
        int N = 3; // Number of items
        int W = 4; // Capacity of the knapsack

        System.out.println(kstpdwn(weight, profit, W, N));


    }
}
