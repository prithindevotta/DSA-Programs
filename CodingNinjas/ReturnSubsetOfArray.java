package cp.CodingNinjas;

import java.util.ArrayList;

public class ReturnSubsetOfArray {
    static ArrayList<ArrayList<Integer>> arList;
    public static int[][] subsets(int input[]) {
        arList = new ArrayList<>();
        ArrayList<Integer> arr = new ArrayList<>();
        subset(input, 0, arr);
        // System.out.println(arList);
        int[][] ans = new int[arList.size()][];
        for(int i=0; i<arList.size(); i++){
            int[] temp = new int[arList.get(i).size()];
            for(int j=0; j<arList.get(i).size(); j++){
                temp[j] =  arList.get(i).get(j);
            }
            ans[i] = temp;
        }
        return ans;
    }
    public static void subset(int input[], int index, ArrayList<Integer> arr) {
        if(index == input.length){
            if(arr.size() > 0){
                arList.add(new ArrayList<>(arr));
            }
            return;
        }
        subset(input, index+1, arr);
        arr.add(input[index]);
        subset(input, index+1, arr);
        arr.remove(arr.size()-1);
    }
}
