
public class KnapsackButtomUpIterative {

    public static int kstpdwn(int[] wt, int[] val, int weight, int length) {
        int[][] tabel = new int[length + 1][weight + 1];

        // intialize first row and coulum to zero

        for (int i = 1; i <= length; i++) {
            for (int j = 1; j <= weight; j++) {

                if (wt[length - 1] <= weight) {

                    tabel[length][weight] = Math.max(val[length - 1] + tabel[length - 1][weight - wt[length - 1]],
                            tabel[length - 1][weight]);

                } else {

                    tabel[length][weight] = tabel[length - 1][weight];
                }
            }
        }
        LongestCommanSubstring.display(tabel);
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
