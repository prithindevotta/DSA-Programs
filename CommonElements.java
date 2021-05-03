package cp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class CommonElements {
    static ArrayList<Integer> commonElements(int A[], int B[], int C[], int n1, int n2, int n3)
    {
        Arrays.sort(A);
        Arrays.sort(B);
        Arrays.sort(C);
        int i=0, j=0, k=0;
        ArrayList<Integer> common = new ArrayList<>();
        while (i<n1 && j<n2 && k<n3){
            if (A[i]==B[j] && B[j]==C[k]){
                if (!common.contains(A[i])){
                    common.add(A[i]);
                }
                i++;
                j++;
                k++;
            }
            else if (A[i]<B[j]){
                i++;
            }
            else if (B[j]<C[k]){
                j++;
            }
            else {
                k++;
            }
        }
        return common;
    }


    public static void main(String[] args){
        Scanner scan =new Scanner(System.in);
        int n1 = scan.nextInt();
        int n2 = scan.nextInt();
        int n3 = scan.nextInt();
        int[] A = new int[n1];
        for (int i=0; i<n1; i++){
            A[i] = scan.nextInt();
        }
        int[] B = new int[n2];
        for (int i=0; i<n2; i++){
            B[i] = scan.nextInt();
        }
        int[] C = new int[n3];
        for (int i=0; i<n3; i++){
            C[i] = scan.nextInt();
        }
        ArrayList<Integer> ans = commonElements(A, B, C, n1, n2, n3);
        for (int i=0; i<ans.size(); i++){
            System.out.println(ans.get(i));
        }
    }
}
