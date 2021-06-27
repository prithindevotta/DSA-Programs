package cp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class NumberOfPairs {
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
    static int upper_bound(long[] arr, int s, long u){
        int f = s;
        int l = arr.length;
        while (f!=l){
            int mid = (f+l)/2;
            if (arr[mid]<=u){
                f = mid+1;
            }
            else {
                l = mid;
            }
        }
        return f;
    }
    static int lower_bound(long[] arr, int s, long l){
        int f = s;
        int e = arr.length;
        while (f!=e){
            int mid = (f+e)/2;
            if (arr[mid]<l){
                f = mid+1;
            }
            else {
                e = mid;
            }
        }
        return f;
    }
    public static void main(String[] args){
        FastReader scan = new FastReader();
        int t = scan.nextInt();
        while(t-->0){
            int n = scan.nextInt();
            long l = scan.nextInt();
            long r = scan.nextInt();
            long[] arr = new long[n];
            for (int i=0; i<n; i++){
                arr[i] = scan.nextLong();
            }
            Arrays.sort(arr);
            long count = 0;
            for (int i=0; i<n-1; i++){
                int lower = lower_bound(arr, i+1, l-arr[i]);
                int upper = upper_bound(arr, i+1, r-arr[i]);
                count += upper-lower;
            }
            System.out.println(count);
        }
    }
}
