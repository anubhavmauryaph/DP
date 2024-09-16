import java.util.Arrays;

public class LongestCommanSubsequenceTopDown {
    // Memoised version of code. 
    static int [][] table;
    static{
        table = new int[10][20];
        // Int
    }

    public static int LCS(String x, String y, int xLength, int yLength){
        
        // Base Condition no need because array filled with zero. 
        for (int i = 1; i < xLength+1  ; i++) {
            for (int j = 1; j < yLength+1; j++) {

                if (x.charAt(i-1) == y.charAt(j-1)) {
                    
                    table[i][j] = 1+table[i-1][j-1];
                }
                else{
                    
                    table[i][j] = Math.max(table[i-1][j], table[i][j-1]);
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
    public static void main(String[] args) {
        String x = "abcdgh";
        String y = "abedfhr";
        System.out.println(LCS(x, y, x.length(), y.length()));
        display(table);
    }

}
