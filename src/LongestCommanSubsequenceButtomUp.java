import java.util.Arrays;

public class LongestCommanSubsequenceButtomUp {
    // Memoised version of code. 
    static int [][] table;
    static{
        table = new int[10][20];
        for (int[] row : table) {
            Arrays.fill(row, -1);
        }
    }
    public static int LCS(String x, String y, int xLength, int yLength){

        // Base Condition 
        if (xLength == 0 || yLength == 0) {
            return 0;
        }
        if (table[xLength][yLength]!=-1) {

            return table[xLength][yLength];
        }
        if (x.charAt(xLength-1) == y.charAt(yLength-1)) {
            
            table[xLength][yLength] = 1+LCS(x, y, xLength-1, yLength-1);
            return table[xLength][yLength];
        }

        table[xLength][yLength] = Math.max(LCS(x, y, xLength-1, yLength), LCS(x, y, xLength, yLength-1));
        return table[xLength][yLength];
    }
    public static void main(String[] args) {
        String x = "abcdgh";
        String y = "abedfhr";

        System.out.println(LCS(x, y, x.length(), y.length()));
    }

}
