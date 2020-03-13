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
            boolean[] check = new boolean[numbers.length()];
            check[i] = true;
            dfs(numbers,Integer.toString(numbers.charAt(i) - '0'),check);    
        }
        
        answer = set.size();
        System.out.println(answer);
        return answer;
    }
	
	 public static void dfs(String numbers,String position,boolean[] check) {
		 	
	 	if(position.charAt(0) == '0') return;
	 	
	 	if(primeCheck((Integer.parseInt(position))) == false) set.add(Integer.parseInt(position));
	 	
	 	if(position.length() == numbers.length()) return;
        
        for(int i=0;i<numbers.length();i++) {
            if(check[i] == false) {
                position += numbers.charAt(i) - '0';
                check[i] = true;;
                dfs(numbers,position,check);
                check[i] = false;
                position = position.substring(0,position.length()-1);
                
            }
        }
	 }
	 
	 public static boolean primeCheck(int num) {
		 boolean[] primecheck = new boolean[num+1];
		 
		 primecheck[0] = true;
		 primecheck[1] = true;
		 
		 for(int i=2;i<=num/2+1;i++) {
			 for(int ii=i*2;ii<=num;ii+=i) {
				 primecheck[ii] = true;
			 }
		 }
		 
		 return primecheck[num];
	 }
	

}
