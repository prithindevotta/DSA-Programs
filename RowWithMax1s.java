package cp;

import java.util.Arrays;

public class RowWithMax1s {

    static int rowWithMax1s(int arr[][], int n, int m) {
        int maxCount = Integer.MIN_VALUE;
        int row = -1;
        for (int i=0; i<n; i++){
            int get = Arrays.binarySearch(arr[i], 1);
            if(get>=0){
                int count=0;
                int left = get;
                while (get<m && arr[i][get] == 1){
                    get++;
                    count++;
                }
                while (left-1>=0 && arr[i][left-1] == 1){
                    count++;
                    left--;
                }
                if (count>maxCount){
                    maxCount = count;
                    row = i;
                }
            }
        }
        return row;
    }

    public static void main(String[] args){
        int[][] arr = {{0, 1, 1, 1},
                {0, 0, 1, 1},
                {1, 1, 1, 1},
                {0, 0, 0, 0}};
        System.out.println(rowWithMax1s(arr, 4, 4));
    }
}
