
import java.util.*;

public class PrintLCSeq {
    static Stack<Character> stack = new Stack<>();
    static int[][] table;
    static {
        table = new int[10][20];
        // Int
    }

    public static int LCS(String x, String y, int xLength, int yLength) {

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
        return table[xLength][yLength];
    }

    public static void display(int [][] arr){
        for (int[] row : arr) {
            System.out.println(Arrays.toString(row));
        }

    }
    public static void printComman(String x, String y, int xLength, int yLength){

        int i = xLength;
        int j = yLength;
        while (i>0 || j>0) {
            if (x.charAt(i-1) == y.charAt(j-1)) {
                stack.push(x.charAt(i-1));
                i--;
                j--;
            }
            else{
                if (table[i][j-1] > table[i-1][j]) {
                    j--;
                }
                else{
                    i--;
                }
            }
        }
        while(!stack.isEmpty()) {
            System.out.print(stack.pop());
        }
    }
    

    public static void main(String[] args) {
        
        String x = "abcde";
        String y = "abfce";
        System.out.println(LCS(x, y, x.length(), y.length()));
        printComman(x, y, x.length(), y.length());
    }
}

