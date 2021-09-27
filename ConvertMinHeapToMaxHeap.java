package cp;

import java.util.Scanner;

public class ConvertMinHeapToMaxHeap {
    static long[] arr;

    public static int convert(long[] arr, int index){
        int left = 2*index+1;
        int right = 2*index+2;
        if (right>arr.length-1){
            if (left>arr.length-1){
                return index;
            }
            else {
                if(arr[left]>arr[index]){
                    long temp = arr[index];
                    arr[index] = arr[left];
                    arr[left] = temp;
                }
                return index;
            }
        }
        int max = arr[convert(arr, left)] > arr[convert(arr, right)] ? convert(arr, left) : convert(arr, right);
        if (arr[index]<arr[max]){
            long temp = arr[index];
            arr[index] = arr[max];
            arr[max] = temp;

            convert(arr, max);
        }
        return index;
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        arr = new long[n];
        for (int i=0; i<n; i++){
            arr[i] = scan.nextLong();
        }
        convert(arr, 0);

        for (int i=0; i<n; i++){
            System.out.println(arr[i]);
        }
    }
}
