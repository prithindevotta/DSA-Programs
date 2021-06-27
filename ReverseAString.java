package cp;

public class ReverseAString {
    public static void reverseString(char[] s) {
        int i=0, j=s.length-1;
        char temp;
        while (i<j){
            temp = s[i];
            s[i] = s[j];
            s[j] = temp;
            i++;
            j--;
        }
        for (char c: s){
            System.out.print(c);
        }
    }


    public static void main(String[] args){
        reverseString("to".toCharArray());
    }
}
