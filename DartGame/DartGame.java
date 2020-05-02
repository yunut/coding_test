package DartGame;

public class DartGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String dartResult = "1D2S#10S";
		solution(dartResult);
	}
	
	public static int solution(String dartResult) {
	      int answer = 0;
	      int[] games = new int[3];
	      int index=0;
	      int count=0;
	      
	      while(count < 3) {
	    	  int score;
	          if(dartResult.charAt(index+1) != '0') {
	            score = dartResult.charAt(index) - '0';
	            index++;
	          } else {
	              score = Integer.parseInt(dartResult.substring(index,index+1));
	              index = index+2;
	          }
	          
	          if(dartResult.charAt(index) == 'D') {
	              score = (int) Math.pow(score,2);
	          } else if(dartResult.charAt(index) == 'T') {
	              score = (int) Math.pow(score,3);
	          }
	          index++;
	          games[count] = score;
	          if(index >= dartResult.length()) break;
	          if(dartResult.charAt(index) == '#') {
	              index++;
	              games[count] = 0 - score;
	          } else if(dartResult.charAt(index) == '*') {
	              index++;
	              if(count > 0) {
	                  games[count-1] = games[count-1] * 2;
	                  games[count] = games[count] * 2;
	              } else {
	                  games[count] = games[count] * 2;
	              }
	          }
	          count++;
	      }
	      for(int i=0;i<games.length;i++) {
	          answer += games[i];
	      }
	      
	      return answer;
	  }

}
