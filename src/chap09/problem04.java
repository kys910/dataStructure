package chap09;

import java.util.Stack;

public class problem04 {
    public static String solution(String input){
        Stack<String> st = new Stack<>();
        String result = "";

        for (int i = 0; i < input.length(); i++) {
            st.add(String.valueOf(input.charAt(i)));
        }

        //System.out.println(st.toString());
        //System.out.println(st.size());

        /*
        ***************** stack은 size()로 반복문을 사용하면 안된다. 반복문을 사용하면서 pop을 하게 되면, 그 과정에서 값이 달라지기 때문에 제대로 된 값을 출력하지 못한다
        for (int i = 0; i < st.size(); i++) {
            System.out.println(result);
            result += st.pop();
        }
        * while(!st.isEmpty()) 를 사용하여야 한다. *
         */

        while(!st.isEmpty()){
            result += st.pop();
        }

        return result;
    }
    public static void main(String [] args){
        System.out.println(solution("abcde"));
    }
}
