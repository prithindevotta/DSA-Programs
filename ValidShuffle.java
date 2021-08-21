package cp;

import java.util.Arrays;

public class ValidShuffle {
    public static void main(String[] args){
        System.out.println(shuffleCheck("X", "12", "1XY2"));
    }

    static boolean shuffleCheck(String first, String second, String result) {
        if (first.length() + second.length() != result.length()){
            return false;
        }
        char[] fst = first.toCharArray();
        char[] snd = second.toCharArray();
        char[] res = result.toCharArray();
        Arrays.sort(fst);
        Arrays.sort(snd);
        Arrays.sort(res);
        first = String.valueOf(fst);
        second = String.valueOf(snd);
        result = String.valueOf(res);

        int i=0, j=0,k=0;
        while (k<result.length()){
            if (i<first.length() && first.charAt(i) == result.charAt(k)){
                i++;
            }
            else if (j<second.length() && second.charAt(j)==result.charAt(k)){
                j++;
            }
            else {
                return false;
            }
            k++;
        }
        if (i<first.length() || j<second.length()){
            return false;
        }
        return true;
    }
}
