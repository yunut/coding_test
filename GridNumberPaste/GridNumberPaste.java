package GridNumberPaste;

import java.util.*;

public class GridNumberPaste {
	
	 private static int xMax = 4;
	 private static int yMax = 4;
	 private static HashSet number = new HashSet();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] question = {{1,1,1,1},{1,1,1,2},{1,1,2,1},{1,1,1,1}};
		solution(question);
	}
	
	public static void solution(int[][] question) {
        
		for(int i=0;i<question.length;i++) {
            for(int ii=0;ii<question[i].length;ii++) {
                dfs(question,i,ii,"",0);
            }
        }
		System.out.println("#1"+ " " + number.size());
    }
	
	 public static void dfs(int[][] map,int x,int y,String answer,int length) {
    	if(length == 7) {
            number.add(answer);
            return;
        }
        if(x<0 || y <0 || x>=xMax || y>= yMax) {
            return;
        }
        answer += Integer.toString(map[x][y]);
        dfs(map,x+1,y,answer,length+1);
        dfs(map,x-1,y,answer,length+1);
        dfs(map,x,y+1,answer,length+1);
        dfs(map,x,y-1,answer,length+1);
        
        return;
	 }
	

}
