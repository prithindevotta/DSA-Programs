package cp.CodingNinjas;

import java.util.ArrayList;

public class ReturnPermutations {
    static ArrayList<String> arList;
    public static String[] permutationOfString(String input){
        arList = new ArrayList<>();
        permutationOfString(input, "");
        String[] ans = new String[arList.size()];
        for(int i=0; i<arList.size(); i++){
            ans[i] = arList.get(i);
        }
        return ans;
    }
    public static void permutationOfString(String input, String s){
        if(input.length() <= 0){
            arList.add(s);
            return;
        }

        for(int i=0; i<input.length(); i++){
            permutationOfString(input.substring(0, i)+input.substring(i+1), s+input.charAt(i));
        }
    }
}
