package cp.CodingNinjas;

import java.util.ArrayList;

public class AllCodes {
    static ArrayList<String> arList;
    public static  String[] getCode(String input){
        arList = new ArrayList<>();
        getCode(input, 0, 0, "");
        String[] ans = new String[arList.size()];
        for(int i=0; i<arList.size(); i++){
            ans[i] = arList.get(i);
        }
        return ans;
    }
    public static void getCode(String input, int prev, int n, String s){
        if(prev > 26){
            return;
        }
        if(n>=input.length()){
            if(prev == 0){
                arList.add(s);
            }
            return;
        }
        if(prev == 0){
            int num = Integer.parseInt(input.charAt(n)+"");
            if(num <= 26){
                int c = 'a'+ (num-1);
                getCode(input, 0, n+1, s+(char)c);
                getCode(input, num, n+1, s);
            }
        }
        else{
            int num = prev*10 + Integer.parseInt(input.charAt(n)+"");
            if(num <= 26){
                int c = 'a'+ (num-1);
                getCode(input, 0, n+1, s+(char)c);
                getCode(input, num, n+1, s);
            }
        }

    }
}
