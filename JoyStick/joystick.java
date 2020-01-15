package JoyStick;



public class joystick {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "JEROEN";
		solution(name);
	}
	
	 public static int solution(String name) {
		 int answer = 0;
	        //65 'A' 90 'Z'
	        
	        //알파벳 이동에 필요한 수 계산
	        for(int i=0;i<name.length();i++) {
	            if(name.charAt(i) <= 'N') {
	                answer += name.charAt(i) - 65;
	            } else {
	                answer += 91 - name.charAt(i) ;
	            }
	        }
	        
	        //커서 이동수 계산
	        int count1=1;
	        int count2=1;
	        
	        for(int i=1;i<name.length();i++) {
	            if(name.charAt(i) == 'A') {
	                count1++;
	            } else {
	                break;
	            }
	        }
	        
	        for(int i=name.length()-1;i>=0;i--) {
	            if(name.charAt(i) == 'A') {
	                count1++;
	            } else {
	                break;
	            }
	        }
	        
	        if(count1 > count2) {
	            answer += count2;
	        } else if (count1 == count2) {
	            answer += name.length() -1;
	        } else {
	            answer += count1;
	        }
	        
	        
	        return answer;
	  }

}
