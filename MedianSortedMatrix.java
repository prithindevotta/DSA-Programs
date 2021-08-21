package cp;

import com.projectsjava.DecimalToBinary;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class MedianSortedMatrix {
    static int median(int matrix[][], int r, int c) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i=0; i<r; i++) {
            if (matrix[i][0] < min) {
                min = matrix[i][0];
            }
            if (matrix[i][c-1] > max) {
                max = matrix[i][c-1];
            }
        }

        int des = (r*c+1)/2;
        while (min<max){
            int mid = min + (max-min)/2;
            int get = 0;
            int place = 0;
            for (int i=0; i<r; i++){
                get = Arrays.binarySearch(matrix[i], mid);

                if (get<0){
                    get = Math.abs(get)-1; //-(insertion point)-1
                }

                else {
                    while (get<c && matrix[i][get] == mid){
                        get++;
                    }
                }
                place += get;
            }
            if (place<des){
                min = mid+1;
            }
            else {
                max = mid;
            }
        }
        return min;
    }
    public static void main(String[] args){
        int [][] matrix = {{1, 3, 5},{2, 6, 9},{3, 6, 9}};
        System.out.println(median(matrix, 3, 3));

    }
}
