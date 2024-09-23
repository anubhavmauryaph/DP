
import java.util.*;

public class PrintShortestCommonSupersequence {
    
    public static void printCommanSupersequence(String x, String y, int xLength, int yLength) {
        int[][] table = PrintLongestCommonSequence.table;
        PrintLongestCommonSequence.LCS(x, y, xLength, yLength); // create table for memostation 
        var stack = new Stack<>();


        int i = xLength;
        int j = yLength;
        while (i > 0 && j > 0) {
            if (x.charAt(i - 1) == y.charAt(j - 1)) {
                stack.push(x.charAt(i - 1));
                i--;
                j--;
            } else {
                if (table[i][j - 1] > table[i - 1][j]) {
                    stack.push(y.charAt(j - 1));
                    j--;
                } else {
                    stack.push(x.charAt(i - 1));
                    i--;
                }
            }
        }
        while (i>0) {
            stack.push(x.charAt(i-1));
            i--;
        }
        
        while (j>0) {
            stack.push(y.charAt(j-1));
            j--;
        }
        while (!stack.isEmpty()) {
            System.out.print(stack.pop());
        }
    }

    public static void main(String[] args) {
        String a = "acbcf";
        String b = "abcdaf";
        int aLength = a.length();
        int bLength = b.length();

        // Initialize the table for LCS
        PrintLongestCommonSequence.table = new int[aLength + 1][bLength + 1];
        printCommanSupersequence(a, b, a.length(), b.length());
    }
}
