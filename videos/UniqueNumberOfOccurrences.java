package cp.videos;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

//https://leetcode.com/problems/unique-number-of-occurrences/
public class UniqueNumberOfOccurrences {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int a: arr){
            map.put(a, map.getOrDefault(a, 0)+1);
        }
        Set<Integer> set = new HashSet(map.values());
        return map.size() == set.size();
    }
}

