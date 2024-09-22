import java.util.Arrays;

public class LongestCommanSubstring {
    static int[][] table;
    static {
        table = new int[20][20];
        // Int
    }

    public static int LCS(String x, String y, int xLength, int yLength) {

        // Base Condition no need because array filled with zero.
        int maxLength = 0;  // Track the maximum length
        for (int i = 1; i < xLength + 1; i++) {
            for (int j = 1; j < yLength + 1; j++) {


                if (x.charAt(i - 1) == y.charAt(j - 1)) {

                    table[i][j] = 1 + table[i - 1][j - 1];
                    maxLength = Math.max(maxLength, table[i][j]);
                } else {

                    // table[i][j] = Math.max(table[i-1][j], table[i][j-1]);
                    // Make zero because if substring is discontinous. then set new substring lenth
                    // zero.
                    table[i][j] = 0;
                }
            }
        }
        return maxLength;
    }

    public static void display(int[][] arr) {
        for (int[] row : arr) {
            System.out.println(Arrays.toString(row));
        }
    }

    public static void main(String[] args) {

        String x = "abcde";
        String y = "abfce";
        System.out.println(LCS(x, y, x.length(), y.length()));
        display(table);
    }

    public class display {
    }
}
