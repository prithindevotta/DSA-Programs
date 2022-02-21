package cp.CodingNinjas;

public class RemoveX {
    public static String removeX(String input){
        return removeX(input, 0);
    }
    public static String removeX(String input, int index){
        if(index > input.length()-1){
            return input;
        }
        if(input.charAt(index) == 'x'){
            if(index != input.length()-1){
                String ans = input.substring(0, index)+input.substring(index+1);
                return removeX(ans, index);
            }
            else{
                String ans = input.substring(0, index);
                return removeX(ans, index);
            }
        }
        return removeX(input, index+1);
    }
}
