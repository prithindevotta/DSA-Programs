package cp.CodingNinjas;

public class QuickSort {
    public static void quickSort(int[] input) {
        quickSort(input, 0, input.length-1);
    }
    public static int findPivot(int[] input, int s, int e){
        int count = 0;
        for(int i=s+1; i<=e; i++){
            if(input[i]<input[s]){
                count++;
            }
        }
        return count;
    }
    public static void quickSort(int[] input, int s, int e) {

        if(s>=e){
            return;
        }

        int pivotIndex = findPivot(input, s, e) + s;
        int temp = input[s];
        input[s] = input[pivotIndex];
        input[pivotIndex] = temp;
        int i = s;
        int j = e;

        while(i<pivotIndex && j>pivotIndex){
            while(input[i]<input[pivotIndex]){
                i++;
            }
            while(input[j]>=input[pivotIndex]){
                j--;
            }
            if(i != pivotIndex && j != pivotIndex){
                temp = input[i];
                input[i] = input[j];
                input[j] = temp;
                i++;
                j--;
            }
        }
        quickSort(input, s, pivotIndex-1);
        quickSort(input, pivotIndex+1, e);
    }
}
