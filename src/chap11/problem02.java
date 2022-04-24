package chap11;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class problem02 {
    public static int[] solution(int[] n){
        if(n.length == 0){
            return new int[]{};
        }

        if(n[0] % 2 == 0){
            return IntStream.concat(Arrays.stream(new int[n[0]]), Arrays.stream(solution(Arrays.copyOfRange(n, 1, n.length)))).toArray();
        }else{
            return solution(Arrays.copyOfRange(n, 1, n.length));
        }
    }
    public static void main(String[] args){
        System.out.println(Arrays.toString(solution(new int[]{1,2,3,4,5})));
    }
}
