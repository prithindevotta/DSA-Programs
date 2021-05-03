package cp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class MergeArray {
    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new
                    InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }
    static void merge(int[] arr1, int[] arr2, int n, int m) {
        int i=n-1, j=0, temp;
        while(i>=0 && j<m){
            if(arr1[i]>arr2[j]){
                temp = arr1[i];
                arr1[i] = arr2[j];
                arr2[j] = temp;
            }
            i--;
            j++;
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);
    }
    public static void main(String[] args){
        FastReader scan = new FastReader();
        int n = scan.nextInt();
        int m = scan.nextInt();
        int[] arr1 = new int[n];
        int[] arr2 = new int[m];
        for (int i=0; i<n; i++){
            arr1[i]= scan.nextInt();
        }
        for (int i=0; i<m; i++){
            arr2[i]= scan.nextInt();
        }
        merge(arr1, arr2, n, m);

    }
}
