package cp.CodingNinjas;

import java.util.ArrayList;

public class KeypadCode {
    static ArrayList<String> arr;
    public static String[] keypad(int n){
        arr = new ArrayList<>();
        keypad(n, "");
        String[] ans = new String[arr.size()];
        for(int i=0; i<arr.size(); i++){
            ans[i] = arr.get(i);
        }
        return ans;
    }

    public static void keypad(int n, String s){
        if(n <= 1){
            arr.add(s);
            return;
        }
        int a = n%10;
        int e = 3;
        int t = (a - 2)*3;
        if(a == 7 || a == 9){
            e = 4;
        }
        if(a == 8 || a == 9){
            t = t+1;
        }
        for(int i = t; i<t+e; i++){
            int c = 'a'+i;
            keypad(n/10, (char)c+s);
        }
    }
}
