package cp;

public class SortedUnsorted {

    static Boolean sorted(int i, int[] arr){
        if (i>= arr.length){
            return true;
        }
        if(arr[i]<arr[i-1]){
            return false;
        }
        return sorted(i+1, arr);
    }

    public static void main(String[] args){
        int[] arr = {1,2,3,4,2,6};
        System.out.println(sorted(1, arr));

    }
}
