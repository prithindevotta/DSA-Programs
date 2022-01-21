package cp;

public class MajorityElement {
    static int findMajority(int a[], int size){
        int cand = 0, count=1;
        for(int i=1; i<size; i++){
            if(a[cand] == a[i]){
                count++;
            }
            else{
                count--;
            }
            if(count == 0){
                cand = i;
                count = 1;
            }
        }
        return a[cand];
    }
    static int majorityElement(int a[], int size)
    {
        int cand = findMajority(a, size);
        int count = 0;
        for(int i: a){
            if(i == cand){
                count++;
            }
        }
        if(count > size/2){
            return cand;
        }
        return -1;
    }
}
