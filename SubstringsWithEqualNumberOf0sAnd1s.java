package cp;

import java.util.Stack;

public class SubstringsWithEqualNumberOf0sAnd1s {

    static int divide(String s){
        int count0 = 0;
        int count1 = 0;
        int ans = 0;
        for (int i=0; i<s.length(); i++){
            if (s.charAt(i) == '0'){
               count0++;
            }
            else {
                count1++;
            }
            if (count0 == count1){
                ans++;
            }
        }
        if (ans == 0){
            return -1;
        }
        else{
            return ans;
        }
    }

    public static void main(String[] args){
        System.out.println(divide("0111100010"));
    }
}
