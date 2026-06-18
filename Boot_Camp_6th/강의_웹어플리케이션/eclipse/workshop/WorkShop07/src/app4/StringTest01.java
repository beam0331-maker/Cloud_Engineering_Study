package app4;

import java.util.StringTokenizer;

public class StringTest01 {

	public static void main(String[] args) {
		String str = "I am second to none";
		StringTokenizer st = new StringTokenizer(str);
		StringBuilder sb = new StringBuilder();
		
		char[] alpabets = str.toCharArray();
		int totalAlpabet = 0;
		for(char c : alpabets) {
			if(c != ' ') {
				totalAlpabet++;
				sb.append(c).append(" ");
			}
				
		}
		
		System.out.println(sb + "문자갯수: " + totalAlpabet);
		System.out.println(str + " 단어갯수: " + st.countTokens());
		
		

	}

}
