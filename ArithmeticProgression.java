package cp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ArithmeticProgression {
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
        int t = scan.nextInt();
        int a, b, c;
        while(t-->0){
            a = scan.nextInt();
            b = scan.nextInt();
            c= scan.nextInt();
            int add=0, sub=0, ans=0;
            if((a+c)%2 != 0){
                add = (a+c+1)/2;
                sub = (a+c-1)/2;
                ans = Math.min(Math.abs(b-add),Math.abs(b-sub))+1;
            }
            else{
                ans  = Math.abs(b-((a+c)/2));
            }
            System.out.println(ans);
        }
    }
}
