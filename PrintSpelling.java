package cp;

public class PrintSpelling {

    static void print(int n, String[] arr){
        if(n==0){
            return;
        }
        print(n/10, arr);

        System.out.println(arr[n%10]);
    }

    public static void main(String[] args){
        String[] arr = {"ZERO", "ONE", "TWO", "THREE", "FOUR", "FIVE", "SIX", "SEVEN", "EIGHT", "NINE", "TEN"};
        print(470, arr);
    }
}
