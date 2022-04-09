package chap08;

import java.util.HashMap;

public class problem03 {
	public static String solution(String a) {
		HashMap<String, Boolean> hm = new HashMap<String, Boolean>();
		
		for (int i = 0; i < a.length(); i++) {
			hm.put(a.charAt(i) + "", true);
		}
		
		for(char i='a'; i<='z'; i++) {
			if(hm.get(i + "") == null) {
				return i + "";
			}
		}
		
		return null;
	}

	public static void main(String[] args) {
		System.out.println(solution("the quick brown box jumps over a lazy dog"));
	}
}
