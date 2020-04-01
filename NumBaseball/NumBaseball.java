package NumBaseball;

public class NumBaseball {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] baseball = { 
				{123,1,1}, 
				{356,1,0}, 
				{327,2,0}, 
				{489,0,1}
		}; 
		solution(baseball);
	}
	
	public static int solution(int[][] baseball) {
		int answer=0;
		for(int i=123;i<987;i++) {
			String[] target = Integer.toString(i).split("");
			
			//중복되거나 0이나오면 넘김
			if(target[0].equals(target[1]) || target[1].equals(target[2]) || target[0].equals(target[2])) continue;
			if(target[0].equals("0") || target[1].equals("0") || target[2].equals("0")) continue;
			
			boolean isRight = true;
			for(int ii=0;ii<baseball.length;ii++) {
				int st = 0;
				int ball = 0;
				String[] question = Integer.toString(baseball[ii][0]).split("");
				
				//타겟숫자와 질문숫자를 비교후 스트라이크, 볼 계산
				for(int iii=0;iii<target.length;iii++) {
					for(int iiii=0;iiii<question.length;iiii++) {
						if(iii == iiii && target[iii].equals(question[iiii])) st++;
						else if(target[iii].equals(question[iiii])) ball++;
					}
				}
				
				//질문의 스트라이크와 볼 수가 일치하면 다음 질문으로, 아니면 끝냄
				if(st == baseball[ii][1] && ball == baseball[ii][2]) continue;
				else {
					isRight = false;
					break;
				}
			}
			
			//모든 스트라이크와 볼 수가 일치하면 증가
			if(isRight == true) answer++;
		}
		return answer;
	}

}
