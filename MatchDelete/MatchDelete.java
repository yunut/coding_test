package MatchDelete;

public class MatchDelete {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "baabaa";
		solution(s);
	}
	
	public static int solution(String s)
    {
        int answer = 0;
        int size = s.length();
        boolean frag;
        
        StringBuilder str = new StringBuilder(s);
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        
        while(size != 0) {
            frag = false;
            for(int i=0;i<size-1;i++) {
                if(str.substring(i,i+1).equals(str.substring(i+1,i+2))) {
                    str.delete(i,i+2);
                    frag = true;
                    size = size -2;
                    break;
                }
            }
            if(frag == false) {
                answer = 0;
                break;
            } else {
                answer = 1;
            }
        }


        return answer;
    }

}
