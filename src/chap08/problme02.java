package chap08;

import java.util.HashMap;

public class problme02 {
	public static String solution(String[] a, String[] b) {
		HashMap<String, Boolean> hm = new HashMap<String, Boolean>();
		for (int i = 0; i < b.length; i++) {
			hm.put(b[i], true);
		}
		
		for (int i = 0; i < a.length; i++) {
			if(hm.get(a[i]) != null) {
				return a[i];
			}
		}
		return null;
	}
	
	public static void main(String[] args) {
		System.out.println(solution(new String[]{"a","b","c","d","e","f"}, new String[]{"b","c"}));
	}
}
