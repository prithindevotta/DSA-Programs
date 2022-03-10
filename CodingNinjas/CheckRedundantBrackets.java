package cp.CodingNinjas;

import java.util.Stack;

public class CheckRedundantBrackets {
    public static boolean checkRedundantBrackets(String s) {
        Stack<Character> st = new Stack<>();
        int count = 0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == '('){
                st.push((char)count);
                count = 0;
                st.push(s.charAt(i));
            }
            else if(s.charAt(i) == ')'){
                if(st.peek() != (char)0 && st.peek() != (char)1){
                    st.pop();
                    st.pop();
                }
                else{
                    return true;
                }
            }
            else{
                count++;
                if(i<s.length()-1 && s.charAt(i+1) == ')'){
                    st.push((char)count);
                }
            }
        }
        return false;
    }
}
