package cp;

import java.util.ArrayList;

public class PrintAllSubsequences {
    static ArrayList<String> arr = new ArrayList<>();
    public static void main(String[] args){
        String input = "abcd";
        String output = "";
        allSubstring(input, output);
        for (String i: arr){
            System.out.println(i);
        }
    }

    private static void allSubstring(String input, String output) {
        if (input.length() == 0){
            arr.add(output);
            return;
        }
        allSubstring(input.substring(1), output+input.charAt(0));
        allSubstring(input.substring(1), output);
    }
}
