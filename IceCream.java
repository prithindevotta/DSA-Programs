package cp;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class IceCream {
    static int[] icecreamParlor(int m, int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i =0; i< arr.length; i++){
            int y = m - arr[i];
            if (y>=0){
                if (map.get(y)==null){
                    map.put(arr[i], i);
                }
                else {
                    return new int[]{map.get(y)+1,i+1};
                }
            }
        }
        return null;
    }
    public static void main(String[] args){
        int[] out = icecreamParlor(4, new int[]{1, 4, 5, 2, 3});
        for (int i: out){
            System.out.println(i);
        }
    }
}
