package cp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class middleValue {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
                new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String[] S = read.readLine().split(" ");
            int A=Integer.parseInt(S[0]);
            int B=Integer.parseInt(S[1]);
            int C=Integer.parseInt(S[2]);
            Solution1 ob = new Solution1();
            System.out.println(ob.middle(A,B,C));
        }
    }
}
class Solution1{
    int middle(int A, int B, int C){
        int x = A-B;
        int y = B-C;
        int z = C-A;
        if(x*y > 0) return B;
        if(y*z > 0) return C;

        return A;
    }
}