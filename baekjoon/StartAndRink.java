package baekjoon;

import java.util.*;

public class StartAndRink {
	
	private static int N;
	private static boolean[] isCheck;
	private static int[][] map;
	private static int answer;
	
	public void startandrind() {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		isCheck = new boolean[N];
		map = new int[N][N];
		answer = 100000000;
		for(int i=0;i<N;i++) {
			for(int ii=0;ii<N;ii++) {
				map[i][ii] = sc.nextInt();
			}
		}
		
		dfs(0);
		System.out.println(answer);
	}
	
	public static void dfs(int count) {
		if(N/2 == count) {
			int startNum=0;
			int rinkNum=0;
			for(int i=0;i<map.length;i++) {
				for(int ii=0;ii<map[i].length;ii++) {
					if(i==ii) continue;
					if(isCheck[i] == true && isCheck[ii] == true) startNum += map[i][ii];
					else if(isCheck[i] == false && isCheck[ii] == false) rinkNum += map[i][ii];
				}
			}
			if(Math.abs(startNum-rinkNum) < answer) answer = Math.abs(startNum-rinkNum);
			return;
		}
		
		for(int i=0;i<N;i++) {
			if(isCheck[i] == true) continue;
			isCheck[i] = true;
			dfs(count+1);
			isCheck[i] = false;
		}
	}
}
