package MazeSearch;

import java.awt.Point;
import java.util.*;

public class MazeSearch {
	
	private static Queue<Point> q = new LinkedList<>();
	private static int xMax;
	private static int yMax;
	private static int[] dx = {-1,1,0,0};
	private static int[] dy = {0,0,-1,1};

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String[] mapSize = sc.nextLine().split("\\s");
		xMax = Integer.parseInt(mapSize[0]);
		yMax = Integer.parseInt(mapSize[1]);
		int answer =0;
		int[][] map = new int[xMax][yMax];
		
		//입력부
		for(int i=0;i<xMax;i++) {
			String[] tmp = sc.nextLine().split("");
			for(int ii=0;ii<yMax;ii++) {
				map[i][ii] = Integer.parseInt(tmp[ii]);
			}
		}
		
		//bfs 처리
		q.offer(new Point(0,0));
		bfs(map);
		System.out.println(map[xMax-1][yMax-1]);
	}
	
	public static void bfs(int[][] map) {
		
		while(!q.isEmpty()) {
			for(int i=0;i<4;i++) {
				int nextX = q.peek().x + dx[i];
				int nextY = q.peek().y + dy[i];
				
				if(nextX < 0 || nextY < 0 || nextX >= xMax || nextY >= yMax) {
					continue;
				}
				
				if(map[nextX][nextY] != 1) {
					continue;
				}
				map[nextX][nextY] = map[q.peek().x][q.peek().y] + 1;
				q.offer(new Point(nextX,nextY));
			}
			q.poll();
		}
		
	}

}
