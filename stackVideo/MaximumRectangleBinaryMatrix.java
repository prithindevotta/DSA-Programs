package cp.stackVideo;

import java.util.Arrays;
import java.util.Stack;

public class MaximumRectangleBinaryMatrix {
    static class Pair{
        int value;
        int index;
        Pair(int value, int index){
            this.index = index;
            this.value = value;
        }
    }
    public static int MAH(int[] arr, int n){
        Stack<Pair> st = new Stack<>();
        int[] left = new int[n];
        for (int i=0; i<n; i++){
            if(st.isEmpty()){
                left[i] = -1;
            }
            else{
                while(!st.isEmpty() && st.peek().value >= arr[i]){
                    st.pop();
                }
                if(st.isEmpty()){
                    left[i] = -1;
                }
                else{
                    left[i] = st.peek().index;
                }
            }
            st.push(new Pair(arr[i], i));
        }

        int[] right = new int[n];
        Stack<Pair> st2 = new Stack<>();
        for (int i=n-1; i>=0; i--){
            if(st2.isEmpty()){
                right[i] = n;
            }
            else{
                while(!st2.isEmpty() && st2.peek().value >= arr[i]){
                    st2.pop();
                }
                if(st2.isEmpty()){
                    right[i] = n;
                }
                else{
                    right[i] = st2.peek().index;
                }
            }
            st2.push(new Pair(arr[i], i));
        }

        int maxArea = 0;
        for(int i=0; i<n; i++){
            int temp = arr[i]*(Math.abs(right[i] - left[i])-1);
            if(temp > maxArea){
                maxArea = temp;
            }
        }
        return maxArea;
    }

    static void maxBinaryArea(int[][] mat, int n, int m){
        int[] levels = new int[m];
        int maxArea = 0;
        for (int i=0; i<n; i++){
            for (int j=0; j<m; j++){
                if(mat[i][j] == 1){
                    levels[j]+=1;
                }
                else{
                    levels[j] = 0;
                }
            }
            maxArea = Integer.max(MAH(levels, m), maxArea);
        }
        System.out.println(maxArea);
    }

    public static void main(String[] args){
        int[][] arr = {{0,1,1,0},{1,1,1,1},{1,1,1,1},{1,1,0,0}};
        maxBinaryArea(arr, arr.length, arr[0].length);
    }
}
