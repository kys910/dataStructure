package chap20;

import java.util.HashMap;

public class problem06 {
    public static void main(String[] args){
        //int[] arr = {10, 5, 12, 3, 55, 30, 4, 11, 2};
        int[] arr = {19, 13, 15, 12, 18, 14, 17, 11};

        System.out.println(solution(arr));
    }

    private static int solution(int[] arr){
        int result = 0;

        HashMap<Integer, Boolean> hm = new HashMap<>();

        for (int a :
             arr) {
            hm.put(a, true);
        }

        int tmp = 0;

        for (int a:
             arr) {
            int b = a;
            tmp = 0;

            while(true){
                if(!hm.containsKey(b)){
                    break;
                }else{
                    b++;
                    tmp++;
                }
            }
            if(result < tmp){
                result = tmp;
            }
        }

        return result;
    }
}
