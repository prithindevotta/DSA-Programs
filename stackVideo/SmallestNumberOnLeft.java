package cp.stackVideo;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class SmallestNumberOnLeft {
    static List<Integer> leftSmaller(int n, int a[])
    {
        List<Integer> arr = new ArrayList<>();
        Stack<Integer> st = new Stack<>();

        for(int i=0; i<n; i++){
            if(st.isEmpty()){
                arr.add(-1);
            }

            else{
                while(st.size() > 0 && st.peek() >= a[i]){
                    st.pop();
                }

                if(st.isEmpty()){
                    arr.add(-1);
                }
                else{
                    arr.add(st.peek());
                }
            }
            st.push(a[i]);
        }
        return arr;
    }
}
