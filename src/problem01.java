import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class problem01 {
	public static int[] solution(int[] a, int[] b) {
		String select = null;
		ArrayList<Integer> d = new ArrayList<Integer>();
		
		HashMap<Integer, Boolean> c = new HashMap<Integer, Boolean>();
		
		if(a.length > b.length) {
			for (int i = 0; i < b.length; i++) {
				c.put(b[i], true);
			}
			
			select = "a";
		}else {
			for (int i = 0; i < a.length; i++) {
				c.put(a[i], true);
			}
			
			select = "b";
		}
		
		if("a".equals(select)) {
			for (int i = 0; i < a.length; i++) {
				if(c.get(a[i]) != null) {
					d.add(a[i]);
				}
			}
		}
		else {
			for (int i = 0; i < b.length; i++) {
				if(c.get(b[i]) != null) {
					d.add(b[i]);
				}
			}
		}
		
		int[] arr = d.stream().mapToInt(i -> i).toArray();
		
		return arr;
	}

	public static void main(String[] args) {
		int[] result = solution(new int[]{1,2,3,4,5}, new int[]{0,2,4,6,8});
		System.out.println(Arrays.toString(result));
	}
}
