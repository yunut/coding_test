package MadeLargeNumber;

public class MadeLargeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String number = "1924";
		int k = 2;
		solution(number,k);
	}
	
	public static String solution(String number, int k) {
		String answer = "0";
        StringBuilder sb = new StringBuilder(number);
        int ii;

        for(int i=0;i<k;i++) {
            for(ii=0;ii<number.length()-1;ii++) {
                if(sb.charAt(ii) - '0' < 
                  sb.charAt(ii+1) - '0') {
                    break;
                }
            }
            sb.deleteCharAt(ii);
        }
        answer = sb.toString();
        return answer;
	}
}
