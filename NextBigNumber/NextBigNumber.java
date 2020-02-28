package NextBigNumber;

public class NextBigNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 78;
		solution(n);
	}
	
	public static int solution(int n) {
	      int answer = 0;
	      String binaryTmp = Integer.toBinaryString(n);
	      int binaryLen = binaryTmp.replace("0", "").length();
	      answer = n+1;
	      while(true) {

              binaryTmp = Integer.toBinaryString(answer).replace("0","");
              if(binaryTmp.length() == binaryLen) break;    
	          answer++;
	          
	      } 
	      System.out.println(answer);
	      return answer;
	  }

}
