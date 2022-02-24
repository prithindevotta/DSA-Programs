package cp.CodingNinjas;

public class DuplicateInArray {
    public static int findDuplicate(int[] arr) {
        for(int i=0; i<arr.length; i++){
            arr[i] += 1;
        }
        for(int i=0; i<arr.length; i++){
            int index = Math.abs(arr[i])-1;
            if(arr[index] > 0){
                arr[index] = -1*arr[index];
            }
            else{
                return index;
            }
        }
        return -1;
    }
}
