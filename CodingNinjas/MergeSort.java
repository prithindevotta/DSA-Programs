package cp.CodingNinjas;

public class MergeSort {
    public static void mergeSort(int[] input){
        mergeSort(input, 0, input.length-1);
    }

    public static void mergeSort(int[] input, int s, int e){
        if(s>=e){
            return;
        }

        int mid = s+(e-s)/2;
        mergeSort(input, s, mid);
        mergeSort(input, mid+1, e);

        int p1 = s, p2 = mid+1, i=0;
        int[] temp = new int[e-s+1];
        while(p1 <= mid && p2 <= e){
            if(input[p1]<=input[p2]){
                temp[i] = input[p1];
                p1++;
                i++;
            }
            else{
                temp[i] = input[p2];
                p2++;
                i++;
            }
        }
        while(p1<=mid){
            temp[i] = input[p1];
            p1++;
            i++;
        }
        while(p2<=e){
            temp[i] = input[p2];
            p2++;
            i++;
        }
        for(int j=s; j<=e; j++){
            input[j] = temp[j-s];
        }
    }
}
