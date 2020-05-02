package MapMove;

import java.util.*;
import java.awt.Point;

public class MapMove {
	
	private static boolean[][] check;
    private static Queue<Point> q; //bfs를 위한 큐
    private static PriorityQueue<PosHeight> overHeightq; //차이나는 좌표를 저장하기위한 큐
    private static int[] dx = {0,0,-1,1};
    private static int[] dy = {-1,1,0,0};

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] land = {{1,4,8,10},{5,5,5,5},{10,10,10,10},{10,10,10,20}};
		int height = 3;
		solution(land,height);
	}
	
	 public static int solution(int[][] land, int height) {
	        int answer = 0;
	        q = new LinkedList<>();
	        overHeightq = new PriorityQueue<>();
	        check = new boolean[land.length][land[0].length];
	        
	        
	        q.offer(new Point(0,0));
	        check[0][0] = true;
	        bfs(land,height);
	        while(!overHeightq.isEmpty()) {
	        	int x = overHeightq.peek().getX();
	        	int y = overHeightq.peek().getY();
	        	if(check[y][x] == true) {
	        		overHeightq.poll();
	        		continue;
	        	}
	        	
	        	answer += overHeightq.peek().getHeight();
	        	q.offer(new Point(x,y));
	        	check[y][x] = true;
	        	bfs(land,height);
	        }
	        System.out.println(answer);
	        return answer;
	    }
	    
    public static void bfs(int[][] land, int height) {
        while(!q.isEmpty()) {
        	int x = (int) q.peek().getX();
        	int y = (int) q.peek().getY();
            for(int i=0;i<4;i++) {
                int nextX = x + dx[i];
                int nextY = y + dy[i];
                if(nextX < 0 || nextX >= land[0].length || nextY < 0 || nextY >= land.length) {
                    continue;
                }
                if(check[nextY][nextX] == false && Math.abs(land[nextY][nextX] - land[y][x]) <= height) {
                    check[nextY][nextX] = true;
                    q.offer(new Point(nextX,nextY));
                }else if(check[nextY][nextX] == false && Math.abs(land[nextY][nextX] - land[y][x]) > height) {
                	overHeightq.offer(new PosHeight(Math.abs(land[nextY][nextX] - land[y][x]), nextX, nextY));
                }
                
            }
            q.poll();
        }
    }
}

class PosHeight implements Comparable<PosHeight> {
    
    private int height;
    private int x;
    private int y;
    
    public PosHeight(int height,int x,int y) {
        this.height = height;
        this.x = x;
        this.y = y;
    }
    
    public int getHeight() {
        return height;
    }
    
    public int getX() {
        return x;
    }
    
    public int getY() {
        return y;
    }
    
    @Override
    public int compareTo(PosHeight o) {
    	if(this.height > o.height) {
    		return 1;
    	} else if(this.height < o.height) {
    		return -1;
    	}
    	return 0;
    }
}