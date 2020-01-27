package SquareRoot;

public class SquareRoot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long n = 121;
		solution(n);
	}
	
	 public static long solution(long n) {
	      long answer = 0;
	      for(long i=1;i<n;i++) {
	          if(i*i > n) {
	              answer = -1;
	              break;
	          } else if(i*i < n) {
	              continue;
	          } else {
	              answer = (i+1) * (i+1);
	          }
	      }
	      return answer;
	  }

}
