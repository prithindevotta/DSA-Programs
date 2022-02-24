package cp.stackVideo;

import java.util.Stack;

public class TrappingRainWater {
    static long trappingWater(int arr[], int n) {
        long ans = 0;
        int[] leftx = new int[n];
        int[] rightx = new int[n];
        leftx[0] = arr[0];
        rightx[n-1] = arr[n-1];
        for(int i=1; i<n; i++){
            leftx[i] = Integer.max(leftx[i-1], arr[i]);
        }
        for(int i=n-2; i>=0; i--){
            rightx[i] = Integer.max(rightx[i+1], arr[i]);
        }
        for(int i=0; i<n; i++){
            ans += Integer.min(leftx[i], rightx[i]) - arr[i];
        }
        return ans;
    }

    static long trappingWaterStack(int arr[], int n) {
        long ans = 0;
        Stack<Integer> st = new Stack<>();
        for(int i=0; i<n; i++){
            while(!st.isEmpty() && arr[st.peek()]<arr[i]){
                int p_h = arr[st.peek()]; //current element
                st.pop();

                if(st.isEmpty()){
                    break;
                }

                int d = i - st.peek() - 1;
                int h = Integer.min(arr[st.peek()], arr[i]) - p_h;

                ans+= d*h;
            }
            st.push(i);
        }
        return ans;
    }
}
