package cp;

import com.sun.jdi.connect.IllegalConnectorArgumentsException;

public class LongestRepeatingSubsequence {

    public static int LongestRepeatingSubseq(String str)
    {
        int n = str.length();
        int[][] t = new int[n+1][n+1];
        for (int i=0; i<n+1; i++){
            for(int j=0; j<n+1; j++){
                if (i==0 || j==0){
                    t[i][j] = 0;
                }
            }
        }
        for (int i=1; i<n+1; i++){
            for(int j=1; j<n+1; j++){
                if (str.charAt(i) == str.charAt(j) && i!=j){
                    t[i][j] = 1+t[i-1][j-1];
                }
                else{
                    t[i][j] = Integer.max(t[i][j-1], t[i-1][j]);
                }
            }
        }
        return t[n][n];
    }

    public static void main(String[] args){
        System.out.println(LongestRepeatingSubseq("xxxhlriugbhirtgjhrbixxx"));
    }
}
