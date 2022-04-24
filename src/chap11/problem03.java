package chap11;

public class problem03 {
    public static int solution(int n){
        if(n == 1){
            return 1;
        }

        return n + solution(n-1);
    }
    public static void main(String[] args){
        System.out.println(solution(2));
    }
}
