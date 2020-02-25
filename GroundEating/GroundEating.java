package GroundEating;

public class GroundEating {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] land = {{1,2,3,5},{5,6,7,8},{4,3,2,1}};
		solution(land);
	}
	
	public static int solution(int[][] land) {
        int answer = 0;
        int max=0;
        for(int i=land.length-2;i>=0;i--) {
            for(int ii=0;ii<land[i].length;ii++) {
            	max = 0;
                for(int iii=0;iii<land[i].length;iii++) {
                	if(ii == iii) {
                		continue;
                	}
                	if(land[i+1][iii] > max) {
                		max = land[i+1][iii];
                	}
                }
                land[i][ii] += max;
            }
        }
        
        
        for(int i=0;i<4;i++) {
        	if(answer < land[0][i]) {
        		answer = land[0][i];
        	}
        }

        return answer;
    }

}
