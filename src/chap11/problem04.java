package chap11;

import java.util.Arrays;

public class problem04 {
    public static int solution(String[] n){
        if(n[0].equals("x")){
            return 0;
        }
        //System.out.println(solution(Arrays.copyOfRange(n,1,n.length)) + 1);
        return solution(Arrays.copyOfRange(n,1,n.length)) + 1;
    }
    public static void main(String[] args){
        System.out.println(solution(new String[]{"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"}));
    }
}
