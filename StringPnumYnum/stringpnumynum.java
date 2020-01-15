package StringPnumYnum;

import java.util.Arrays;
import java.util.Comparator;

public class stringpnumynum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Pyy";
		solution(s);
	}
	
	 static boolean solution(String s) {
	        boolean answer;
	        int p_count=0;
	        int y_count=0;

	        for(int i=0;i<s.length();i++) {
	            if(s.toUpperCase().charAt(i) == 'P') {
	                p_count++;
	            } else if(s.toUpperCase().charAt(i) == 'Y') {
	                y_count++;
	            }
	        }
	        
	        if(p_count == y_count) {
	            answer = true;
	        } else {
	            answer = false;
	        }

	        return answer;
	    }

}
