
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestReverseStringII {
	static List<String> testCases = new ArrayList<>(
			Arrays.asList("Hello",
					"Hello World"));
	static List<String> checkCases = new ArrayList<>(
			Arrays.asList("olleH",
					"dlroW olleH"));
	
	public static void main(String[] args) {
		
		
		Solution sol = new Solution();
		String s = null;
		String res = null;
		
		for (int i = 0; i < testCases.size(); i++) {
			s = testCases.get(i);
			System.out.println("CASE " + i + " : "+ s);
			res = sol.reverseStringII(s);
			System.out.println("Result: " + res);
			System.out.println("CHECK : " + checkCases.get(i));
		}
		
	}

}
