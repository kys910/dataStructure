package chap11;

public class problem05 {
    public static int solution(int rows, int columns){
        if(rows == 1 || columns == 1){
            return 1;
        }

        return solution(rows -1, columns) + solution(rows, columns -1);
    }
    public static void main(String[] args){
        System.out.println(solution(3, 6));
    }
}
