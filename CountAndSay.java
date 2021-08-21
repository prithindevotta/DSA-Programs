package cp;

import second.Hashmap;

import javax.swing.*;
import java.util.HashMap;

public class CountAndSay {

    public static String countAndSay(int n) {
        if (n == 1){
            return "1";
        }
        int i=0, j=1;
        String prev = countAndSay(n-1);
        StringBuilder res = new StringBuilder();
        if (prev.length()==1){
            return res.append(j-i).append(prev.charAt(i)).toString();
        }
        while (j<prev.length()){
            if (prev.charAt(i)==prev.charAt(j)){
                j++;
            }
            else {
                res.append(j-i).append(prev.charAt(i));
                i = j;
            }
        }
        res.append(j-i).append(prev.charAt(i));
        return res.toString();
    }

    public static void main(String[] args){
        System.out.println(countAndSay(5));
    }
}
