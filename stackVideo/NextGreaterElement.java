package cp.stackVideo;

import java.util.Stack;

public class NextGreaterElement {
    public static long[] nextLargerElement(long[] a, int n)
    {
        long[] arr = new long[n];
        Stack<Long> st = new Stack<>();

        for(int i=n-1; i>=0; i--){
            if(st.isEmpty()){
                arr[i] = -1;
            }

            else{
                while(st.size() > 0 && st.peek() <= a[i]){
                    st.pop();
                }

                if(st.isEmpty()){
                    arr[i] = -1;
                }
                else{
                    arr[i] = st.peek();
                }
            }
            st.push(a[i]);
        }
        return arr;
    }
}
