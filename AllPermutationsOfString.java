package cp;

import java.util.ArrayList;
import java.util.Collections;

public class AllPermutationsOfString {
    static ArrayList<String> arr =new ArrayList<>();
    public static void main(String[] args){
        String inp = "ljr";
        String out = "";
        allPermutations(inp, out);
        Collections.sort(arr);
        for (String i: arr){
            System.out.println(i);
        }
    }

    private static void allPermutations(String inp, String out) {
        if (inp.isEmpty()){
            arr.add(out);
            return;
        }
        for (int i=0; i<inp.length(); i++){
            allPermutations(inp.substring(0, i)+inp.substring(i+1), out+inp.charAt(i));
        }
    }
}
