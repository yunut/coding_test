package JoyStick;



public class joystick {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "JEROEN";
		solution(name);
	}
	
	 public static int solution(String name) {
		 	int answer = 0;
		 	char[] names = name.toCharArray();
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
	        //제일 적게 움직이는 경우 좌->우 
	        int min = name.length()-1;
	        
	        //A가 포함되어있을 경우 
	        if(name.contains("A")) {
	        	int moveCnt=1;
	        	
	        	//우-> 좌로 이동하는 경우
	        	for(int i=1;i<names.length;i++) {
	        		if(names[i] != 'A') {
	        			//총 길이에서 우로 이동하는 거리를 빼면 좌로 이동하는 수가 나온다.
	        			moveCnt = names.length-i;
	        			break;
	        		}
	        	}
	        	if(min > moveCnt) {
	        		min = moveCnt;
	        	}
	        	
	        	//좌,우 둘다 움직이는 경우
	        	int i=0;
	        	while( i<names.length) {
	        		int end=0;
	        		if( names[i] == 'A') {
	        			end= i+1;
	        			while(end < names.length && names[end] =='A') {
	        				end++;
	        			}
	        			
	        			//모두 AAAA로 끝나는 경우
	        			if(end == names.length) {
	        				moveCnt = i-1;
	        			
	        			//좌우로 움직여야 하는 상황의 경우 
	        			} else {
	        				//되돌아 가는 거리 + name의 마지막 인덱스 - 뒤로 움직이는 목표 인덱스
	        				moveCnt = 1 + (i-1)*2 + names.length -1 -end;
	        			}
	        			if(moveCnt < min) {
	        				min = moveCnt;
	        			}
	        			
	        			i = end+1;
	        		} else {
	        			i++;
	        		}
	        	}
	        	if(min < moveCnt) {
	        		min = moveCnt;
	        	}
	        }
	        return answer+min;
	  }

}
