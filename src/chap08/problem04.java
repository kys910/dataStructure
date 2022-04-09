package chap08;

import java.util.HashMap;
import java.util.Map.Entry;

public class problem04 {

	public static void main(String[] args) {
		HashMap<String, Integer> hm = new HashMap<String, Integer>();

		String a = "minimum";
		String result = "";

		for (int i = 0; i < a.length(); i++) {
			if (hm.get(a.charAt(i) + "") != null) {
				hm.put(a.charAt(i) + "", hm.get(a.charAt(i) + "") + 1);
			} else {
				hm.put(a.charAt(i) + "", 1);
			}
		}
		
		/*
		
		//EntrySet 이용
		for (Entry<String, Integer> entry : hm.entrySet()) {
			System.out.println("key : " + entry.getKey());
			System.out.println("value : " + entry.getValue());
		}
		
		
		//KeySet 이용
		for (String key : hm.keySet()) {
			System.out.println("key : " + key);
			System.out.println("Value : " + hm.get(key));
		}
		
		Iterator <Entry<String, Integer>> entries = hm.entrySet().iterator();
		while(entries.hasNext()) {
			Entry<String, Integer> entry = entries.next();
			System.out.println("key : " + entry.getKey());
			System.out.println("value : " + entry.getValue());
		}
		
		Iterator <String> keys = hm.keySet().iterator();
		while(keys.hasNext()) {
			String key = keys.next();
			System.out.println("key : " + entry.getKey());
			System.out.println("value : " + entry.getValue());
		}
		*/
		
		for (Entry<String, Integer> entry : hm.entrySet()) {
			if(entry.getValue() == 1) {
				result = entry.getKey();
			}
		}
		
		System.out.println(result);
	}
}
