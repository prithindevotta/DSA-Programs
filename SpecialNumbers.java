package cp;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Scanner;


public class SpecialNumbers {
    private static long Gcd(long a, long b){
        if (a<b){
            long t = a;
            a=b;
            b=t;
        }
        if(b==0){
            return a;
        }
        else{
            return Gcd(b, a%b);
        }
    }
    public static void main(String[] args){
        Scanner scan  =  new Scanner(System.in);
        long n = scan.nextLong();
        LinkedList<Long> nums = new LinkedList<Long>();
        if (n<7){
            System.out.println("0");
        }
        else {
            nums.push(4L);
            nums.push(7L);
            long x = nums.get(1)*10 + 4;
            long y = nums.get(1)*10 + 7;
            int i=0;
            while (x<=n || y<=n){
                if (x<=n && y<=n){
                    nums.push(x);
                    nums.push(y);
                    i=i+2;
                }
                else if (x<=n){
                    nums.push(x);
                    break;
                }
                else {
                    break;
                }
                if (x<n && y<n){
                    x = nums.get(i)*10 + 4;
                    y = nums.get(i)*10 + 7;
                    i--;
                }
            }
            int ans=0;
            for (int j=nums.size()-1; j>=0; j--){
                for (int k=j-1; k>=0; k--){
                    if (Gcd(nums.get(j), nums.get(k))==1){
                        ans++;
                    }
                }
            }
            System.out.println(ans);
        }
    }
}
