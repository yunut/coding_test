package NandM;

import java.util.*;

public class NandM {
	
	private static int n,m;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		
		
		
		for(int i=0;i<n;i++) {
			int[] answer = new int[m];
			boolean[] check = new boolean[n];
			int count = 0;
			dfs(answer,count,check,i);
		}
	}
	
	public static void dfs(int[] answer,int count,boolean[] check,int index) {
		
		answer[count] = index+1;
		check[index] = true;
		count++;
		
		if(count == m) {
			for(int i=0;i<answer.length;i++) {
				System.out.print(answer[i] + " ");
			}
			System.out.println();
			return;
		}
		
		
		for(int i=0;i<n;i++) {
			if(check[i] == true) continue;
			dfs(answer,count,check,i);
			check[i] = false;
		}
		
	}

}
