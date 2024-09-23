
import java.util.*;

public class PrintLongestCommonSequence {
    public static int[][] table;

    public static void LCS(String x, String y, int xLength, int yLength) {
        // fillup the array
        // Base Condition no need because array filled with zero.
        for (int i = 1; i < xLength + 1; i++) {
            for (int j = 1; j < yLength + 1; j++) {

                if (x.charAt(i - 1) == y.charAt(j - 1)) {

                    table[i][j] = 1 + table[i - 1][j - 1];
                } else {

                    table[i][j] = Math.max(table[i - 1][j], table[i][j - 1]);
                }
            }
        }
    }

    public static void printComman(String x, String y, int xLength, int yLength) {

        var stack = new Stack<>();

        LCS(x, y, xLength, yLength);
        int i = xLength;
        int j = yLength;
        while (i > 0 || j > 0) {
            if (x.charAt(i - 1) == y.charAt(j - 1)) {
                stack.push(x.charAt(i - 1));
                i--;
                j--;
            } else {
                if (table[i][j - 1] > table[i - 1][j]) {
                    j--;
                } else {
                    i--;
                }
            }
        }
        while (!stack.isEmpty()) {
            System.out.print(stack.pop());
        }
    }

    public static void main(String[] args) {

        String x = "abcde";
        String y = "abfce";
        int xLength = x.length();
        int yLength = y.length();
        table = new int[xLength + 1][yLength + 1];

        printComman(x, y, xLength, yLength);
    }
}
