package StringtoDescendingOrder;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class DescendingOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "gfedcbZ";
		solution(s);
	}
	
	public static String solution(String s) {
		String answer = "";
	      String[] tmp = s.split("");
	      
	      Arrays.sort(tmp, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				// TODO Auto-generated method stub
				return o2.compareTo(o1);
			}
	    	  
	      });
	      for(int i=0;i<tmp.length;i++) {
            answer += tmp[i];
        }
	      return answer;
	  }

}
