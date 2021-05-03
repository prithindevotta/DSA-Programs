package cp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class DaanishProblems {
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
        FastReader scan =new FastReader();
        int t = scan.nextInt();
        while (t-->0){
            int[] arr = new int[11];
            for (int i=1; i<=10; i++){
                arr[i] = scan.nextInt();
            }
            int k = scan.nextInt();
            int i = 10;
            if (k==0){
                while (arr[i]==0){
                    i--;
                }
                System.out.println(i);
            }
            else {
                while (k>0){
                    if (arr[i]<=k){
                        k = k-arr[i];
                        i--;
                    }
                    else {
                        k=0;
                    }
                }
                while (arr[i]==0){
                    i--;
                }
                System.out.println(i);
            }
        }
    }
}
