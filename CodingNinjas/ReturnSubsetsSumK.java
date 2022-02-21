package cp.CodingNinjas;

import java.util.ArrayList;

public class ReturnSubsetsSumK {
    static ArrayList<ArrayList<Integer>> arList;
    public static int[][] subsetsSumK(int input[], int k) {
        arList = new ArrayList<>();
        ArrayList<Integer> arr = new ArrayList<>();
        subsetsSumK(input, 0, k, arr);
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
    public static void subsetsSumK(int input[], int n, int k, ArrayList<Integer> arr) {
        if(k == 0){
            arList.add(new ArrayList<Integer>(arr));
            return;
        }
        if(n==input.length){
            return;
        }
        if(input[n] <= k){
            subsetsSumK(input, n+1, k, arr);
            arr.add(input[n]);
            subsetsSumK(input, n+1, k-input[n], arr);
            arr.remove(arr.size()-1);
        }

        else{
            subsetsSumK(input, n+1, k, arr);
        }

    }
}
