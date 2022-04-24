package chap11;

public class problem11_4 {
    public static int solution(int a){
        int result = 0;
        if(a < 0){
            //System.out.println("0");
            return 0;
        }

        if(a == 1 || a == 0){
            //System.out.println("1");
            return 1;
        }

        //System.out.println(solution(a-1) + solution(a-2) + solution (a-3));
        return solution(a-1) + solution(a-2) + solution (a-3);
    }

    public static void main(String[] args){
        System.out.println(solution(11));
    }
}
