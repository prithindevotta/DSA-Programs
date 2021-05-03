package cp;

import java.util.Arrays;

public class CountInversions {
    static long inversionCount(long arr[], long N)
    {
        long inv=0;
        int l = 0;
        int r = (int)N-1;
        inv = mergeSort(arr, l, r);
        return inv;
    }

    private static long mergeSort(long[] arr, int l, int r) {
        int m = (l+r)/2;
        long inv=0;
        if (l<r){
            inv+=mergeSort(arr, l, m);
            inv+=mergeSort(arr, m+1, r);
            inv+=merge(arr,m ,l, r);
        }
        return inv;
    }

    private static long merge(long[] arr, int m, int l, int r) {
        int i=0, j=0, k=l;
        long[] left = Arrays.copyOfRange(arr, l, m+1);
        long[] right = Arrays.copyOfRange(arr, m+1, r+1);
        long inv = 0;
        while (i<left.length && j< right.length){
            if (left[i]<=right[j]){
                arr[k]= left[i];
                i++;
                k++;
            }
            else {
                arr[k]=right[j];
                inv += left.length-i;
                k++;
                j++;
            }
        }
        while (i< left.length){
            arr[k] = left[i];
            i++;
            k++;
        }
        while (j< right.length){
            arr[k]=right[j];
            k++;
            j++;
        }
        return inv;
    }

    public static void main(String[] args){
        long[] arr = {468, 335, 1, 170, 225, 479, 359, 463, 465, 206, 146, 282, 328, 462, 492, 496, 443, 328, 437, 392, 105, 403, 154, 293, 383, 422, 217, 219, 396, 448, 227, 272, 39, 370, 413, 168, 300, 36, 395, 204, 312, 323};
        /*long[] arr ={2, 3, 4, 5, 6};*/
        System.out.println(inversionCount(arr, arr.length));
    }
}
