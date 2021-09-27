package cp;

import java.util.Scanner;

public class BuildingHeapFromArray {

    static void heapify(int[] arr, int ind, int n){
        int largest = ind;
        int i = 2*ind+1;
        int j = 2*ind+2;
        if(i<n && arr[i]>=arr[largest]){
            largest = i;
        }
        if(j<n && arr[j] >= arr[largest]){
            largest = j;
        }
        if(largest != ind){
            int temp = arr[ind];
            arr[ind] = arr[largest];
            arr[largest] = temp;

            heapify(arr, largest, n);
        }
    }

    static void buildHeap(int[] arr, int n){
        for (int i=n/2-1; i>=0; i--){
            heapify(arr, i, n);
        }
    }
    static void heapSort(int arr[], int n)
    {
        buildHeap(arr, n);
        for(int i = n-1; i>0; i--){
            int temp = arr[i];
            arr[i] = arr[0];
            arr[0] = temp;

            heapify(arr, 0, i);
        }
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        int[] arr = new int[n];
        for (int i=0; i<n; i++){
            arr[i] = scan.nextInt();
        }
        heapSort(arr, n);

        printHeap(arr, n);
    }

    private static void printHeap(int[] arr, int n) {
        System.out.println("Array representation of Heap is:");

        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");

        System.out.println();
    }
}
