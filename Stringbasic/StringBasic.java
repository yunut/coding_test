package Stringbasic;

import java.util.Arrays;
import java.util.Comparator;

public class StringBasic {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "1234";
		solution(s);
	}
	
	public static boolean solution(String s) {
	      boolean answer = true;
	      
	      if(!(s.length() == 4 || s.length() == 6)) {
	          answer= false;
	      }
	      for(int i=0;i<s.length();i++) {
	          if(s.charAt(i) > 57) {
	              answer=false;
	          }
	      }
	      
	      return answer;
	  }
}
