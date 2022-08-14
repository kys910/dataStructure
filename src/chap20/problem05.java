package chap20;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class problem05 {
    public static void main(String[] args){
        double[] arr = {98.6, 98.0, 97.1, 99.0, 98.9, 97.8, 98.5, 98.2, 98.0, 97.1};

        System.out.println(sort(arr).toString());
    }
    private static ArrayList<Double> sort(double[] arr){
        ArrayList<Double> result = new ArrayList<Double>();
        HashMap<Double, Integer> hm = new HashMap<Double, Integer>();

        for (double a:
             arr) {
            if(hm.containsKey(a)){
                int b = hm.get(a);
                hm.put(a, b+1);
            }else{
                hm.put(a, 1);
            }
        }

        for (int i = 970; i <= 990 ; i++) {
            if(hm.containsKey(i / 10.0)){
                int count = hm.get(i / 10.0);

                for (int j = 0; j < count; j++) {
                    result.add(i / 10.0);
                }
            }
        }

        return result;
    }
}
