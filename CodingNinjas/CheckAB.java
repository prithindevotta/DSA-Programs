package cp.CodingNinjas;

public class CheckAB {
    public static boolean checkAB(String input) {
        return checkAB(input, 0, 'e');

    }
    public static boolean checkAB(String input, int index, char prev) {
        if(index >= input.length()){
            if(prev == 'e' || prev == 'a'){
                return true;
            }
            return false;
        }
        if(prev == 'a'){
            if(input.charAt(index) == 'a' || input.charAt(index) == 'b'){
                return checkAB(input, index+1, input.charAt(index));
            }
            else{
                return false;
            }
        }
        if(prev == 'b'){
            if(input.charAt(index) == 'b'){
                return checkAB(input, index+1, 'e');
            }
            else{
                return false;
            }
        }
        if(prev == 'e'){
            if(input.charAt(index) == 'a'){
                return checkAB(input, index+1, input.charAt(index));
            }
            return false;
        }
        return false;
    }
}
