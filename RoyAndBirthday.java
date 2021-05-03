package cp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class RoyAndBirthday {
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
    static long fact(long n){
        long fact=1;
        for(long i=1;i<=n;i++){
            fact=fact*i;
        }
        return fact;
    }

    public static void main(String[] args){
        FastReader scan = new FastReader();
        int t = scan.nextInt();
        while(t-->0){
            String inp = scan.nextLine();
            char[] vowels = {'a', 'e', 'i', 'o', 'u'};
            int[] repeat = new int[26];
            String duplicate = inp.substring(0, inp.length());
            long count = 0;
            for (char i: vowels){
                if (duplicate.contains(String.valueOf(i))){
                    duplicate = duplicate.replace(String.valueOf(i), "");
                    count++;
                    repeat[i]++;
                }
            }
            if (inp.length()-count==count-1){
                System.out.println(fact(count) * fact(count - 1));
            }
            else if (inp.length()-count==count){
                System.out.println(fact(count) * fact(count) * 2);
            }
            else if (inp.length()-count>count){
                System.out.println(fact(count) * fact(inp.length() - count) / fact(inp.length() - count - (count + 1)));
            }
            else {
                System.out.println("-1");
            }
        }
    }
}
