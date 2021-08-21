package cp;

import java.util.Arrays;

public class PrintSortedMatrix {

    static int[][] sortedMatrix(int N, int Mat[][]) {
        int[] arr = new int[N*N];
        int k = 0;
        for (int i=0; i<N; i++){
            for (int j=0; j<N; j++){
                arr[k] = Mat[i][j];
                k++;
            }
        }
        Arrays.sort(arr);
        k = 0;
        for (int i=0; i<N; i++){
            for (int j=0; j<N; j++){
                Mat[i][j] = arr[k];
                k++;
            }
        }
        return Mat;
    }

    public static void main(String[] args){
        int[][] arr = {{10, 20, 30, 40}, {15, 25, 35, 45}, {27,29,37,48}, {32,33,39,50}};
        int[][] ans = sortedMatrix(3, arr);
        for (int i=0; i<3; i++){
            for (int j=0; j<3; j++){
                System.out.print(ans[i][j]);
            }
            System.out.println();
        }
    }
}
