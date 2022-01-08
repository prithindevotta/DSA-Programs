package cp.videos;

//https://www.codingninjas.com/codestudio/problems/sort-0-1-2_631055?source=youtube&campaign=LoveBabbar_Codestudiovideo1&utm_source=youtube&utm_medium=affiliate&utm_campaign=LoveBabbar_Codestudiovideo1

public class Sort012 {
    public static void sort012(int[] arr)
    {
        int i=0, j=0, k=arr.length-1;
        while(j<=k){
            if(arr[j] == 0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j++;
            }
            else if(arr[j] == 1){
                j++;
            }
            else if(arr[j]==2){
                int temp = arr[k];
                arr[k] = arr[j];
                arr[j] = temp;
                k--;
            }
        }
    }
}

