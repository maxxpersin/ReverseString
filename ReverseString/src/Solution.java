
public class Solution {
	/**
	 * @param s: a string
	 * @return: return a string
	 */
	public String reverseStringII(String s) {
		char temp;
		char[] str = s.toCharArray();
		int counter = 0, counter2 = str.length - 1;
		while (!(counter >= counter2)) {
			temp = str[counter];
			str[counter]= str[str.length - 1 - counter];
			str[str.length - 1 - counter] = temp;
			counter++;
			counter2--;
		}
		return String.valueOf(str);
	}
}
