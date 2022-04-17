package chap09;

import java.util.Stack;

public class problem02 {
    public static void main(String[] main){
        System.out.println("6 그리고 5를 읽습니다");

        Stack<Integer> st = new Stack<>();

        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        st.push(6);

        System.out.println(st.pop());
        System.out.println(st.pop());
    }
}
