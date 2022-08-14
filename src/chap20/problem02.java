package chap20;

public class problem02 {
    public static void main(String[] args){
        int[] arr = {2,3,0,6,1,5};
        System.out.println(solution(6, arr));
    }

    public static int solution(int n, int[] arr){
        int result = 0;

        int sum = 0;
        for (int i = 0; i <= n; i++) {
            sum += i;
        }

        int sum2 = 0;
        for (int a:
             arr) {
            sum2 += a;
        }

        result = Math.abs(sum - sum2);

        return result;
    }
}
