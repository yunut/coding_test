package SearchPrimeNumber;

import java.util.*;

public class SerchPrimeNumber {
	
	private static HashSet<Integer> set;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String numbers = "011";
		solution(numbers);
	}
	
	public static int solution(String numbers) {
        int answer = 0;
        set = new HashSet<>();
        
        for(int i=0;i<numbers.length();i++) {
            ArrayList<Integer> check = new ArrayList<>();
            check.add(i);
            dfs(numbers,Integer.toString(numbers.charAt(i) - '0'),check);    
        }
        
        
        
        return answer;
    }
	
	 public static void dfs(String numbers,String position,ArrayList<Integer> check) {
		 	while(true) {
		 		if(position.charAt(0) == '0') {
		 			position.replaceFirst("", "");
		 		} else {
		 			break;
		 		}
		 	}
		 	
	        set.add(Integer.parseInt(position));
	        
	        for(int i=0;i<numbers.length();i++) {
	            if(!check.contains(i)) {
	                position += numbers.charAt(i) - '0';
	                check.add(i);
	                dfs(numbers,position,check);
	            }
	        }
	    }
	

}
