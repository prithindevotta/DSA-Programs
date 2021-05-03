package cp;

import java.util.*;

public class MangoThief {
    public static int binaryS(Integer[] arr, int l, int r, int t){
        while (l<r){
            int mid =(l+r)/2;
            if (l==mid){
                if (arr[mid+1]<=t){
                    l = mid+1;
                }
                break;
            }
            if (arr[mid]==t){
                return mid;
            }
            else if (arr[mid]>t){
                r=mid;
            }
            else {
                l = mid;
            }
        }
        return l;
    }


    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        Map<Integer, Integer> cMap = new HashMap<>();
        int[] arr = new int[n];
        for (int i=0; i<n; i++){
            arr[i] = scan.nextInt();
        }
        for (int i=0; i<m; i++){
            int a = scan.nextInt();
            if (cMap.containsKey(a)){
                cMap.put(a, cMap.get(a)+ scan.nextInt());
            }
            else {
                cMap.put(a, scan.nextInt());
            }
        }
        Integer[] arr1 = cMap.keySet().toArray(new Integer[0]);
        Arrays.sort(arr1);
        for (int i=1; i<arr1.length; i++){
            cMap.put(arr1[i], cMap.get(arr1[i])+cMap.get(arr1[i-1]));
        }
        for (int i: arr){
            if (i<arr1[0]){
                System.out.print("0 ");
            }
            else {
                int res = binaryS(arr1, 0, arr1.length-1, i);
                System.out.print(cMap.get(arr1[res])+" ");
            }
        }
    }
}
