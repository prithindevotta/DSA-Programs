package cp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class PlayWithNumbers {
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
    public static void main(String[] args){
        FastReader scan = new FastReader();
        int n = scan.nextInt();
        int q = scan.nextInt();
        Long[] arr = new Long[n];
        Long a;
        arr[0] = scan.nextLong();
        for (int i=1; i<n; i++){
            a = scan.nextLong();
            arr[i] = arr[i-1]+a;
        }
        for (int i=0; i<q; i++){
            int l = scan.nextInt()-1;
            int r = scan.nextInt()-1;
            if(l>0){
                System.out.println((arr[r] - arr[l-1])/(r-l+1));
            }
            else{
                System.out.println(arr[r]/(r-l+1));
            }

        }
    }
}
