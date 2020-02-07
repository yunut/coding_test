package Collatz;

public class Collatz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 626331;
		System.out.println(solution(num));
	}
	
	public static int solution(int num) {
	      int answer = 0;
	      long tmp = (long) num;
	      for(int i=1;i<=500;i++) {
	          if(tmp == 1) {
	              break;
	          }
	          if(i == 500) {
	              answer = -1;
	              break;
	          }
	          if(tmp % 2 == 0) {
	              tmp = tmp / 2;
	              answer++;
	          } else {
	              tmp = (tmp * 3) + 1;
	              answer++;
	          }
	      }
	      return answer;
	  }

}
