package cp;

import java.util.ArrayList;

public class FirstAndLastOccurrences {

    static ArrayList<Long> find(long[] arr, int n, int x)
    {
        ArrayList<Long> al = new ArrayList<>();
        long i=0,j=n-1, mid=0, flag =0;
        while(i<=j){
            mid = (i+j)/2;
            if (arr[(int) mid]>x){
                j = mid-1;
            }
            else if(arr[(int) mid]<x){
                i = mid+1;
            }
            else if (arr[(int) mid] == x){
                flag =1;
                break;
            }
        }
        if (flag==0){
            al.add((long) -1);
            al.add((long) -1);
        }
        else{
            long first = mid, last = mid;
            while (first>0 && arr[(int) (first-1)] == x){
                first--;
            }
            while (last<n-1 && arr[(int) (last+1)] == x){
                last++;
            }
            System.out.println(first);
            System.out.println(last);
            al.add(first);
            al.add(last);
        }
        return al;
    }

    public static void main(String[] args){
        long[] arr = {6, 9};
        find(arr, arr.length, 9);
    }
}
