package cp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class BishuAndSoldiers {
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
        int[] arr = new int[n];
        for (int  i=0; i<n; i++){
            arr[i] = scan.nextInt();
        }
        Arrays.sort(arr);
        /*for (int  i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }*/
        int t= scan.nextInt();
        while (t-->0){
            int p = scan.nextInt();
            int sum = 0;
            if (p>arr.length){
                for (int i: arr){
                    sum = sum+i;
                }
                System.out.print(arr.length+" ");
            }
            else {
                int l = 0;
                int h = arr.length-1;
                int index = 0;
                while (l<=h){
                    int mid = (l+h)/2;
                    if(arr[mid]<=p){
                        index = mid;
                        l = mid+1;
                    }
                    else if (arr[mid]>p){
                        h = mid-1;
                    }
                    /*System.out.println("l: "+(l+1));
                    System.out.println("h: " + (h+1));
                    System.out.println("mid: "+(mid+1));*/
                }
                for (int i=0; i<=index; i++){
                    sum = sum+arr[i];
                }
                System.out.print((index+1)+" ");
            }
            System.out.println(sum);
        }
    }
}
