package baekjoon;

import java.util.Scanner;

public class NQueen {
	private static int N;
	private static int answer;
	
	public void nqueen() {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		
		for(int i=1;i<=N;i++) {
			int[] col = new int[N+1];
			col[1] = i;
			dfs(col,1);
		}
		
		System.out.println(answer);
	}
	
	public static void dfs(int[] col, int row) {
		if(N==row) {
			answer++;
			return;
		}
		for(int i=1;i<=N;i++) {
			col[row+1] = i;
			if(isPossible(col,row+1)) {
				dfs(col,row+1);
			}
			
		}
		
		
	}
	
	public static boolean isPossible(int[] col,int row) {
		for(int i=1;i<row;i++) {
			//같은 열일 때 false
			if(col[i] == col[row]) return false;
			
			//같은 대각선일때 false
			if(Math.abs(i - row) == Math.abs(col[i] - col[row])) return false;
		}
		return true;
	}

}
