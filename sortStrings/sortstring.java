package sortStrings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class sortstring {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] strings = {"sun", "bed", "car"};
		solution(strings,1);
	}
	
	 public static String[] solution(String[] strings, int n) {
		 String[] answer;
	      
	      Arrays.sort(strings);    
     
	      Arrays.sort(strings, new Comparator<String>() {
	          @Override
	          public int compare(String o1, String o2) {
	        	  
				/*
				 * if(o1.charAt(n) == o2.charAt(n)) { return o1.compareTo(o2); } else { return
				 * o1.charAt(n) - o2.charAt(n); }
				 */
	            return o1.charAt(n) - o2.charAt(n);
	          }
	      });
	      
	      answer = new String[strings.length];
	      for(int i=0;i<strings.length;i++) {
	          answer[i] = strings[i];
	      }
	      
	      return answer;
	  }

}
