package cp;

import java.util.Scanner;

public class Search2DMatrix {

    public static boolean searchMatrix(int[][] matrix, int target) {
        int row=0;
        for (int i=0; i<matrix.length; i++){
            if (target>=matrix[i][0] && target<=matrix[i][matrix[0].length-1]){
                row = i;
                break;
            }
        }
        int j=0,k=matrix[0].length-1, flag = 0;
        while (j<=k){
            int mid = (j+k)/2;
            if (matrix[row][mid]>target){
                k = mid-1;
            }
            else if(matrix[row][mid]<target){
                j = mid+1;
            }
            else if (matrix[row][mid] == target){
                flag++;
                break;
            }
        }
        if (flag !=0){
            return true;
        }
        else {
            return false;
        }
    }

    public static void main(String[] args){
        int[][] arr = {new int[] {1,3,5,7}, new int[] {10,11,16,20}, new int[] {23,30,34,60}};
        System.out.println(searchMatrix(arr, 23));
    }
}
