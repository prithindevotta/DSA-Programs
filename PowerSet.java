package cp;

import java.util.ArrayList;

public class PowerSet {

    static void powerSet(int i, int[] inp, ArrayList<Integer> out){
        if(i >= inp.length){
            for (int j: out){
                System.out.print(j);
            }
            System.out.println();
            return;
        }
        powerSet(i+1, inp, out);
        powerSet(i+1, inp, updateList(out, inp[i]));
    }
    static ArrayList<Integer> updateList(ArrayList<Integer> arr, int n){
        ArrayList<Integer> clone = new ArrayList<>(arr);
        clone.add(n);
        return clone;
    }
    public static void main(String[] args){
        ArrayList<Integer> out = new ArrayList<>();
        int[] inp = {1,2,3};
        powerSet(0, inp, out);
    }
}
