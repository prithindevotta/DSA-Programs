package cp;
import java.util.Scanner;
import java.util.Stack;

public class PalindromeString {

    static int isPlaindrome(String S) {
        int i = 0;
        Stack<Character> st = new Stack<Character>();
        if(S.length()%2 == 0){
            while (i<(S.length()/2)){
                st.push(S.charAt(i));
                i++;
            }
            while (i<S.length()){
                if (st.pop() == S.charAt(i)){
                    i++;
                }
                else {
                    return 0;
                }
            }
        }
        else{
            while (i<(S.length()/2)){
                st.push(S.charAt(i));
                i++;
            }
            i++;
            while (i<S.length()){
                if (st.pop() == S.charAt(i)){
                    i++;
                }
                else {
                    return 0;
                }
            }
        }
        return 1;
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        System.out.println(isPlaindrome(s));
    }
}
