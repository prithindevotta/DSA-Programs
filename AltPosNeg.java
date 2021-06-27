package cp;

import java.util.*;

public class AltPosNeg {
    static int[] rearrange(int[] arr, int n) {
        int i =0, temp;
        for (int j=0; j<n; j++){
            if (arr[j]<0 && i<n){
                temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
                i++;
            }
        }
        int  k=0, l=i;
        while (k<l && l<n && arr[k]<0){
            temp = arr[k];
            arr[k] = arr[l];
            arr[l] = temp;
            k+=2;
            l++;
        }
        return arr;
    }
    public static void main(String[] args){
        int[] arr = {-5, -2, 5, 2, 4, 7, 1, 8, 0, -8};
        int[] op = rearrange(arr, arr.length);
        for (int k: op){
            System.out.println(k);
        }
    }
}
