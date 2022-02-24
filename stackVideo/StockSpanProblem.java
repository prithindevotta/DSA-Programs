package cp.stackVideo;

import java.util.Stack;

public class StockSpanProblem {
    static class Pair{
        int value;
        int index;
        Pair(int value, int index){
            this.value = value;
            this.index = index;
        }
    }
    public static int[] calculateSpan(int arr[], int n)
    {
        Stack<Pair> st = new Stack<>();
        int[] ans = new int[n];
        for(int i=0; i<n; i++){
            if(st.isEmpty()){
                ans[i] = 1;
            }
            else{
                while(!st.isEmpty() && st.peek().value <= arr[i]){
                    st.pop();
                }
                if(st.isEmpty()){
                    ans[i] = i+1;
                }
                else{
                    ans[i] = i - st.peek().index;
                }
            }
            st.push(new Pair(arr[i], i));
        }
        return ans;
    }
}
