package cp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class CostOfBalloon {
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
        int t= scan.nextInt();
        while (t-->0){
            int green = scan.nextInt();
            int purple = scan.nextInt();
            int n = scan.nextInt();
            int[] Q1 = new int[n];
            int[] Q2 = new int[n];
            int count1 = 0, count2 = 0;
            for (int i=0; i<n; i++){
                Q1[i] = scan.nextInt();
                if (Q1[i]==1){
                    count1++;
                }
                Q2[i] = scan.nextInt();
                if (Q2[i]==1){
                    count2++;
                }
            }
            System.out.println((Math.max(green, purple) * Math.min(count1, count2)) + (Math.min(green, purple) * Math.max(count1, count2)));
        }
    }
}
