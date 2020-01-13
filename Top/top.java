package Top;

import java.util.*;

public class top {

	public static void main(String[] args) {
		int[] question = {1,1,3,3,0,1,1};
		Solution(question);
	}
	
	static int[] Solution(int[] heights) {
	       int[] answer;
	        Stack<Integer> s = new Stack<>(); 
	        
	        for(int i=heights.length-1;i>0;i--) {
	            for(int ii=i-1;ii>=0;ii--) {
	            	if(heights[i] < heights[ii]) {
	                    s.push(ii+1);
	                    break;
	                }
	            	
	            	if(ii==0) {
	                    s.push(0);
	                }
	                
	            }
	        }
	        
	        s.push(0);

	        
	        answer = new int[s.size()];
	        int s_size = s.size();
	        for(int i=0;i<s_size;i++) {
	            answer[i] = s.pop();
	        }
	        
	        for(int i=0;i<answer.length;i++) {
	        	System.out.println(answer[i]);
	        }
	        
	        return answer;
	    }

}
