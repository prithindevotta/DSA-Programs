package cp;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class ReorganizeString {
    public static class Pairs implements Comparable<Pairs> {
        char letter;
        int count;

        public Pairs(char letter, int count){
            this.letter = letter;
            this.count = count;
        }

        @Override
        public int compareTo(Pairs o) {
            return Integer.compare(count, o.count);
        }
    }

     public static String reorganizeString(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        char[] arr = s.toCharArray();
        PriorityQueue<Pairs> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(char i: arr){
            if (map.containsKey(i)){
                map.put(i, map.get(i)+1);
            }
            else{
                map.put(i, 1);
            }
        }
        for (Map.Entry<Character, Integer> entry: map.entrySet()){
            pq.add(new Pairs(entry.getKey(), entry.getValue()));
        }
         assert pq.peek() != null;
         if (pq.peek().count > (s.length()+1)/2){
            return "";
        }
        int id=0;
        while (!pq.isEmpty()){
            Pairs pair = pq.poll();
            for (int i=0; i<pair.count; i++){
                arr[id] = pair.letter;
                id+=2;
                if (id >=s.length()){
                    id=1;
                }
            }
        }
        return new String(arr);
    }

    public static void main(String[] args){
        System.out.println(reorganizeString("vvvlb"));
    }
}
