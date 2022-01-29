package cp.CodingNinjas;

public class DynamicArray {
    private int[] arr;
    private int nextIndex;

    public DynamicArray(){
        arr = new int[5];
        nextIndex = 0;
    }
    public void add(int n){
        if(nextIndex == arr.length){
            restructure();
        }
        arr[nextIndex] = n;
        nextIndex++;
    }

    public int size(){
        return nextIndex;
    }

    public Boolean isEmpty(){
        if (size() == 0){
            return true;
        }
        return false;
    }
    public int removeLast(){
        if (size() == 0){
            //error
            return -1;
        }
        int temp = arr[nextIndex-1];
        arr[nextIndex-1] = 0;
        nextIndex--;
        return temp;
    }

    public void set(int n, int a){
        if (n>nextIndex){
            return;
        }
        if(n<nextIndex){
            arr[n] = a;
        }
        else {
            add(a);
        }
    }

    public int get(int index){
        if (index>=nextIndex){
            return 0;
        }
        return arr[index];
    }

    private void restructure() {
        int temp[] = arr;
        arr = new int[arr.length*2];
        for (int i=0; i<temp.length; i++){
            arr[i] = temp[i];
        }
    }
}
