package cp;

import java.util.Scanner;

public class Kth {
    private static int[] arr;
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        int trials = scan.nextInt();
        scan.nextLine();
        while (trials-- > 0){
            int n = scan.nextInt();
            arr = new int[n+1];
            for (int i=0; i<n; i++){
                arr[i] = scan.nextInt();
            }
            arr[n] = Integer.MAX_VALUE;
            int k = scan.nextInt();
            QuickSort(0,n,k);
            System.out.println(arr[k-1]);
        }
    }

    public static int partition(int l, int h){
        int i=l;
        int j=h;
        int pivot = arr[l];
        while (i<j){
            do{
                i++;
            }while (arr[i] <= pivot);
            do {
                j--;
            }while (arr[j] > pivot);
            if (i<j){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        arr[l] = arr[j];
        arr[j] = pivot;
        return j;
    }

    public static void QuickSort(int l, int h, int k){
        if (l<h){
            int pivot = partition(l,h);
            if(pivot == k-1){
                return;
            }
            else {
                QuickSort(l,pivot, k);
                QuickSort(pivot+1, h, k);
            }
        }
    }

}
