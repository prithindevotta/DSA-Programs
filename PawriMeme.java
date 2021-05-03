package cp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class PawriMeme {
    static class FastReader
    {
        BufferedReader br;
        StringTokenizer st;

        public FastReader()
        {
            br = new BufferedReader(new
                    InputStreamReader(System.in));
        }

        String next()
        {
            while (st == null || !st.hasMoreElements())
            {
                try
                {
                    st = new StringTokenizer(br.readLine());
                }
                catch (IOException e)
                {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt()
        {
            return Integer.parseInt(next());
        }

        long nextLong()
        {
            return Long.parseLong(next());
        }

        double nextDouble()
        {
            return Double.parseDouble(next());
        }

        String nextLine()
        {
            String str = "";
            try
            {
                str = br.readLine();
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
            return str;
        }
    }
    public static boolean prime(int n){
        if (n<2){
            return false;
        }
        for (int i = 2; i*i<=n; i++){
            if (n%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        FastReader scan = new FastReader();
        int t= scan.nextInt();
        while(t-->0){
            String a = scan.next();
            if (a.contains("party")){
                a = a.replace("party", "pawri");
            }
            System.out.println(a);
        }
    }
}
