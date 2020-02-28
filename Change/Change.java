package Change;

import java.util.*;

public class Change {
	
	private static int answer;
	private static int[] check;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		int[] money = {1,2,5};
		solution(n,money);
	}
	public static int solution(int n, int[] money) {
	      answer = 0;
	      check = new int[money.length];
	      Arrays.sort(money);
	      dfs(money,n);
	      System.out.println(answer);
	      return answer;
	  }
	    
    public static void dfs(int[] money,int n) {
        if(n == 0) {
        	answer++;
        	return;
        }
        if(n < 0) return;
        
        for(int i=money.length-1;i>=0;i--) {
            dfs(money,n-money[i]);
        }
    }

}
