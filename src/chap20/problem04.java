package chap20;

public class problem04 {
    public static void main(String[] args){
        int[] arr = {5, -10, -6, 9, 4};

        System.out.println(getHighestProduct(arr));
    }

    private static int getHighestProduct(int[] arr){
        int result = 0;

        int highest_num = Integer.MIN_VALUE;
        int second_highest_num = 0;
        int minest_num = Integer.MAX_VALUE;
        int second_minest_num = 0;

        for (int a:
             arr) {
            if(highest_num < a){
                second_highest_num = highest_num;
                highest_num = a;
            }else if(second_highest_num < a){
                second_highest_num = a;
            }

            if(minest_num > a){
                second_minest_num = minest_num;
                minest_num = a;
            }else if(second_minest_num > a){
                second_minest_num = a;
            }
        }

        result = Math.max((highest_num * second_highest_num), (minest_num * second_minest_num));
        return result;
    }
}
