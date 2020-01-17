package FindPrimeNumber;

import java.util.*;

public class FindPrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numbers = 10;
		solution(numbers);

	}
	
	public static int solution(int n) {
		int answer = 0;
	      
	      boolean[] isRight = new boolean[n+1];
	      for(int i=0;i<isRight.length;i++) {
            isRight[i] = true;
        }
          
	      isRight[0] = false;
	      isRight[1] = false;
	      
	      for(int i=2;i<isRight.length;i++) {
            if(isRight[i] == false) continue;
	          for(int ii=i*2;ii<isRight.length;ii+=i) {
	              isRight[ii] = false;
	          }
	      }
	      
	      for(int i=0;i<isRight.length;i++) {
	          if(isRight[i] == true) {
	              answer++;
	          }
	      }
	      
	      return answer;
	}

}
