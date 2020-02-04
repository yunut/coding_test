package KakaoFriendsColoringBook;

import java.awt.Point;
import java.util.LinkedList;
import java.util.Queue;

public class KakaoFriendsColoringBook {
	
	private static int nMax;
    private static int mMax;
    private static Queue<Point> q = new LinkedList<>();
    private static int[] dm = {-1,1,0,0};
    private static int[] dn = {0,0,-1,1};
    private static int maxSizeOfOneArea;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] picture = {{1,1,1,0},{1,2,2,0},{1,0,0,1},{0,0,0,1},{0,0,0,3},{0,0,0,3}};
		int m = 6;
		int n = 4;
		solution(m,n,picture);
	}
	
	public static int[] solution(int m, int n, int[][] picture) {
	      int numberOfArea = 0;
	      maxSizeOfOneArea = 0;
	      nMax = n;
	      mMax = m;
	      int[] answer = new int[2];
	      
	      
	      for(int i=0;i<picture.length;i++) {
	          for(int ii=0;ii<picture[i].length;ii++) {
	              if(picture[i][ii] != 0) {
	                  q.offer(new Point(i,ii));
	                  numberOfArea++;
	                  bfs(picture,picture[i][ii]);
	              }
	          }
	      }
	      answer[0] = numberOfArea;
	      answer[1] = maxSizeOfOneArea;
	      System.out.println(numberOfArea + " " + maxSizeOfOneArea);
	      return answer;
	  }
	
	    public static void bfs(int[][] picture,int target) {
	        int max=0;
	        picture[q.peek().x][q.peek().y] = 0;
	        while(!q.isEmpty()) {
	            for(int i=0;i<4;i++) {
	                int nextM = q.peek().x + dm[i];
	                int nextN = q.peek().y + dn[i];
	                
	                if(nextM < 0 || nextN < 0 || nextM >= mMax || nextN >= nMax) {
	                    continue;
	                }
	                if(picture[nextM][nextN] == 0) {
	                    continue;
	                }
	                if(target == picture[nextM][nextN]) {
	                    q.offer(new Point(nextM,nextN));
	                    picture[nextM][nextN] = 0;
	                }
	            }
	            max++;
	            q.poll();
	        }
	        if(max > maxSizeOfOneArea) {
	            maxSizeOfOneArea = max;
	        }
	    }

}
