package IronRod;

import java.util.*;

public class IronRod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String arrangement = "()(((()())(())()))(())";
		solution(arrangement);
	}
	
	public static int solution(String arrangement) {
		int answer = 0;
        String check = "";
        String[] tmp = arrangement.split("");
        Stack<String> left = new Stack<>();
        Stack<String> right = new Stack<>();
        
        for(int i=0;i<tmp.length;i++) {
        	
            if(tmp[i].equals("(")) {
                left.push(tmp[i]);
            } else if (tmp[i].equals(")") && check.equals("(") ) {
            	left.pop();
                answer += left.size();
            } else {
            	left.pop();
            	answer++;  	
            }

            

      
            check=tmp[i];
        }
        System.out.println(answer);
        return answer;
    }

}
