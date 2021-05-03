package cp;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class KthLargestValue {
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
    public static void main(String[] args){
        FastReader scan = new FastReader();
        int n = scan.nextInt();
        int q = scan.nextInt();
        int[] arr = new int[n];
        int count =0;
        for (int i=0; i<n; i++){
            arr[i] = scan.nextInt();
            if (arr[i]==1){
                count++;
            }
        }
        while (q-->0){
            int t = scan.nextInt();
            int a = scan.nextInt();
            if (t==2){
                if (a<=count){
                    System.out.println("1");
                }
                else {
                    System.out.println("0");
                }
            }
            if (t==1){
                if (arr[a-1]==1){
                    count--;
                    arr[a-1] = 0;
                }
                else {
                    count++;
                    arr[a-1] = 1;
                }
            }
        }
     }
}
