package chap11;

import java.util.Arrays;

public class problem01 {
    public static int solution(String[] n){
        if(n.length == 0){
            return 0;
        }

        System.out.println(Arrays.toString(n));
        return n[0].length() + solution(Arrays.copyOfRange(n, 1, n.length));
    }
    public static void main(String[] args){
        System.out.println(solution(new String[]{"ab", "c", "def", "ghij"}));
    }
}


/*
배열자르기

// 1. 원본 배열
int[] arr = {0, 1, 2, 3, 4, 5};

// 2. 배열을 자를 index
int position = 3;

// 3. 배열 자르기
int[] arr1 = Arrays.copyOfRange(arr, 0, position);
int[] arr2 = Arrays.copyOfRange(arr, position, arr.length);

// 4. 자른 배열 출력
System.out.println(Arrays.toString(arr1)); // [0, 1, 2]
System.out.println(Arrays.toString(arr2)); // [3, 4, 5]
 */