package Plus;

public class Plus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	 public static int solution(int n) {
	        int answer = 0;
	        String tmp;
	        String tmp2;
	        tmp = Integer.toString(n);
	        for(int i=0;i<tmp.length();i++) {
	            tmp2 =  Character.toString(tmp.charAt(i));
	            answer += Integer.parseInt(tmp2);
	        }
	         

	        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
	        

	        return answer;
	    }

}
