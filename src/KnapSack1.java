public class KnapSack1 {
    public static int knapSack(int [] wt, int [] val, int weight, int length) {
    if (length==0 || weight ==0) {
        return 0;
    }
    else if(wt[length-1]<=weight){
        return Math.max(val[length-1]+knapSack(wt, val, weight-wt[length-1], length-1), knapSack(wt, val, weight, length-1));
    } 
    return knapSack(wt, val, weight, length-1); 
    }
    public static void main(String[] args) {
        int N = 3, W = 4, profit[] = {1, 2, 3}, weight[] = {4, 5, 1};
        System.out.println(knapSack(weight, profit, W, N));
    }
}
