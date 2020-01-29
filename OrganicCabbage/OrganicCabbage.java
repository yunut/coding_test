package OrganicCabbage;

import java.util.*;

public class OrganicCabbage {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int count=0;
        int answer=0;
        int T = Integer.parseInt(sc.nextLine());
        //테스트케이스마다 처리
        while(count < T) {
            int M = sc.nextInt();
            int N = sc.nextInt();
            int K = sc.nextInt();
            int tmp1,tmp2;
            int[][] map = new int[N][M];
            
            //초기화 부분
            for(int i=0;i<K;i++) {
                tmp1= sc.nextInt();
                tmp2= sc.nextInt();
                map[tmp2][tmp1] = 1;
            }
            
            //깊이우선탐색
            for(int i=0;i<N;i++) {
                for(int ii=0;ii<M;ii++) {
                    if(map[i][ii] != 0) {
                        dfs(map,i,ii,N,M);
                        answer++;
                    }
                }
            }
            count++;
            System.out.println(answer);
            answer=0;
        }
	}
	
	public static int dfs(int[][] map,int x,int y,int N,int M) {
        if(x<0 || y<0 || x >= N || y >= M) {
            return 0;
        }
        
        if(map[x][y] == 1) {
            map[x][y] = 0;
            dfs(map,x+1,y,N,M);
            dfs(map,x,y+1,N,M);
            dfs(map,x-1,y,N,M);
            dfs(map,x,y-1,N,M);
        }
        
        return 0;
    }

}
