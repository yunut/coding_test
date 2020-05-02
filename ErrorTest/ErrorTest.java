package ErrorTest;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class ErrorTest {
	
	private static int answer;
    private static int[] dx = {0,1,0,-1};
    private static int[] dy = {-1,0,1,0};
    private static int index;

	public static void main(String[] args) {
		int[][] office = {{5,-1,4},{6,3,-1},{2,-1,1}};
		int r =1;
		int c =0;
		String[] move = {"go","go","right","go","right","go","left","go"};
		solution(office,r,c,move);
		
	}
	
	public static int solution(int[][] office, int r, int c, String[] move) {
		int answer = 0;
	      int index=0;
	      int position=0;
	      while(index < move.length) {
	          answer += office[r][c];
	          office[r][c] = 0;

	          switch(move[index]) {
	            case "go":
	                r = r+dy[position];
	                c = c+dx[position];
	                if(r >= office.length || r < 0 || c < 0 || c >= office.length || office[r][c] == -1) {
	                    r = r-dy[position];
	                    c = c-dx[position];
	                }
	                index++;
	                break;
	            case "right":
	                position++;
	                if(position >= dx.length) position=0;
	                index++;
	                break;
	            case "left":
	                position--;
	                if(position < 0) position=3;
	                index++;
	                break;
	        }
	          
	      }
	      System.out.println(answer);
	      return answer;
	  }
	    
	    public static void dfs(int[][] office, int r, int c, String[] move, int position) {
	        if(r < 0 || r >= office.length || c < 0 || c > office.length) {
	            index++;
	            return;
	        }
	        if(index >= move.length) return;
	        
	        if(office[r][c] != -1) {
	            answer += office[r][c];
	            office[r][c] = -1;
	        }
	        
	        switch(move[index]) {
	            case "go":
	                dfs(office,r+dy[position],c+dx[position],move,position);
	                break;
	            case "right":
	                position++;
	                if(position >= dx.length) position=0;
	                index++;
	                dfs(office,r,c,move,position);
	                break;
	            case "left":
	                position--;
	                if(position < 0) position=3;
	                index++;
	                dfs(office,r,c,move,position);
	                break;
	        }
	        
	        
	    }
	

}
