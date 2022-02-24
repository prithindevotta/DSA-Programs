package cp.CodingNinjas;

import java.util.Arrays;

public class TripletSum {
    public static int tripletSum(int[] arr, int num) {

        int count = 0;
        Arrays.sort(arr);
        for(int i=0; i<arr.length; i++){
            int l = i+1;
            int r = arr.length-1;

            while(l<r){
                if(arr[i] + arr[l] + arr[r] == num){
                    int x = arr[l];
                    int y = arr[r];
                    int countx = 0;
                    int county = 0;
                    while(l < r && arr[l] == x){
                        l++;
                        countx++;
                    }
                    while(l<=r && arr[r] == y){
                        r--;
                        county++;
                    }
                    if(x == y){
                        int temp = countx + county;
                        count+= (temp*(temp-1))/2;
                    }
                    else{
                        count += countx*county;
                    }
                }
                else if(arr[i] + arr[l] + arr[r] < num){
                    l++;
                }
                else{
                    r--;
                }
            }
        }
        return count;
    }
}
