package ErrorTest;

import java.util.*;

public class ErrorTest {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	        String target = sc.nextLine();
	        int answer = Integer.parseInt(target);
	        int min_answer = 0;
        while(true) {
        	int tmp = answer;
        	String t = Integer.toString(answer);
            for(int i=0;i<t.length();i++) {
                tmp += Integer.parseInt(t.substring(i,i+1));
            }
            if(tmp == Integer.parseInt(target)) {
            	min_answer=answer;
            }
            answer--;
            if(answer == 0) {
            	break;
            }
            
            
        }
        System.out.println(min_answer);
	}
	
	

}
