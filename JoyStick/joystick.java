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
	        
	        //���ĺ� �̵��� �ʿ��� �� ���
	        for(int i=0;i<name.length();i++) {
	            if(name.charAt(i) <= 'N') {
	                answer += name.charAt(i) - 65;
	            } else {
	                answer += 91 - name.charAt(i) ;
	            }
	        }
	        
	        //Ŀ�� �̵��� ���
	        //���� ���� �����̴� ��� ��->�� 
	        int min = name.length()-1;
	        
	        //A�� ���ԵǾ����� ��� 
	        if(name.contains("A")) {
	        	int moveCnt=1;
	        	
	        	//��-> �·� �̵��ϴ� ���
	        	for(int i=1;i<names.length;i++) {
	        		if(names[i] != 'A') {
	        			//�� ���̿��� ��� �̵��ϴ� �Ÿ��� ���� �·� �̵��ϴ� ���� ���´�.
	        			moveCnt = names.length-i;
	        			break;
	        		}
	        	}
	        	if(min > moveCnt) {
	        		min = moveCnt;
	        	}
	        	
	        	//��,�� �Ѵ� �����̴� ���
	        	int i=0;
	        	while( i<names.length) {
	        		int end=0;
	        		if( names[i] == 'A') {
	        			end= i+1;
	        			while(end < names.length && names[end] =='A') {
	        				end++;
	        			}
	        			
	        			//��� AAAA�� ������ ���
	        			if(end == names.length) {
	        				moveCnt = i-1;
	        			
	        			//�¿�� �������� �ϴ� ��Ȳ�� ��� 
	        			} else {
	        				//�ǵ��� ���� �Ÿ� + name�� ������ �ε��� - �ڷ� �����̴� ��ǥ �ε���
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
