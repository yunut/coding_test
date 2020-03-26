package NandM3;

import java.util.*;

public class NandM3 {
	
	private static int n,m;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		
		
		
		for(int i=0;i<n;i++) {
			int[] answer = new int[m];
			int count = 0;
			dfs(answer,count,i);
		}
	}
	
	public static void dfs(int[] answer,int count,int index) {
		
		answer[count] = index+1;
		count++;
		
		if(count == m) {
			for(int i=0;i<answer.length;i++) {
				System.out.print(answer[i] + " ");
			}
			System.out.println();
			return;
		}
		
		
		for(int i=0;i<n;i++) {
			dfs(answer,count,i);
		}
		
	}

}
