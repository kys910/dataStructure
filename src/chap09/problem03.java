package chap09;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class problem03 {
    public static void main(String[] main){
        System.out.println("1 그리고 2를 읽습니다");

        Queue<Integer> st = new LinkedList<>();

        st.add(1);
        st.add(2);
        st.add(3);
        st.add(4);
        st.add(5);
        st.add(6);

        System.out.println(st.poll());
        System.out.println(st.poll());

        /*
        Queue queue = new LinkedList(); // 타입 설정x Object로 입력
        Queue<QueueDemo> demo = new LinkedList<QueueDemo>(); // 타입을 QueueDemo클래스로 설정
        Queue<Integer> i = new LinkedList<Integer>(); // Integer타입으로 선언
        Queue<Integer> i2 = new LinkedList<>(); // new부분 타입 생략 가능
        Queue<Integer> i3 = new LinkedList<Integer>(Arrays.asList(1, 2, 3)); // 선언과 동시에 초기값 세팅
        Queue<String> str = new LinkedList<String>(); // String타입 선언
        Queue<Character> ch = new LinkedList<Character>(); // Character타입 선언
         */

        /*
        값 추가하기
        Queue<String> que = new LinkedList<>(Arrays.asList("Hello", "World");
         */

        /*
        값 삭제하기
        Queue<String> que = new LinkedList<String>(); // 값 추가
        que.add("Hello"); que.add("World"); que.add("Hello"); que.add("Hello"); que.add("World");
        System.out.println(que); // 결과 출력 -> [Hello, World, Hello, Hello, World]
        que.poll(); // 맨 앞의 값 삭제
        System.out.println(que); // 결과 출력 -> [World, Hello, Hello, World]
        que.remove(); // 맨 앞의 값 삭제
        System.out.println(que); // 결과 출력 -> [Hello, Hello, World]
        que.remove("Hello"); // 해당하는 값 삭제
        System.out.println(que); // 결과 출력 -> [Hello, World]
        que.clear(); // Index의 값 삭제
        System.out.println(que); // 결과 출력 -> []
         */
    }
}
