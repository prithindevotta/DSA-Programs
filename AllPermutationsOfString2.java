package cp;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
//Swap Method
public class AllPermutationsOfString2 {
    static private List<String> ls = new ArrayList<>();
    static void permute(String s, int l, int r){
        if (l==r){
            ls.add(s);
            return;
        }
        for (int i=l; i<=r; i++){
            permute(swap(i, l, s), l+1, r);
        }
    }

    private static String swap(int i, int l, String s) {
        char[] arr = s.toCharArray();
        char temp = arr[i];
        arr[i] = arr[l];
        arr[l] = temp;
        return String.valueOf(arr);
    }

    public static void main(String[] args){
        String s = "ljr";
        permute(s, 0, s.length()-1);
    }
}
