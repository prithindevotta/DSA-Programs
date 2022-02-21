package cp.CodingNinjas;

public class BinarySearchRecursive {
    public static int binarySearch(int[] input, int element) {
        return binarySearch(input, 0, input.length-1, element);
    }
    public static int binarySearch(int[] input, int s, int e, int element) {
        if(s>e){
            return -1;
        }
        int mid = s +(e-s)/2;
        if(input[mid] == element){
            return mid;
        }
        else if(input[mid]<element){
            return binarySearch(input, mid+1, e, element);
        }
        else{
            return binarySearch(input, s, mid-1, element);
        }
    }
}
