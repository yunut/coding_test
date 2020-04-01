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
			
			//�ߺ��ǰų� 0�̳����� �ѱ�
			if(target[0].equals(target[1]) || target[1].equals(target[2]) || target[0].equals(target[2])) continue;
			if(target[0].equals("0") || target[1].equals("0") || target[2].equals("0")) continue;
			
			boolean isRight = true;
			for(int ii=0;ii<baseball.length;ii++) {
				int st = 0;
				int ball = 0;
				String[] question = Integer.toString(baseball[ii][0]).split("");
				
				//Ÿ�ټ��ڿ� �������ڸ� ���� ��Ʈ����ũ, �� ���
				for(int iii=0;iii<target.length;iii++) {
					for(int iiii=0;iiii<question.length;iiii++) {
						if(iii == iiii && target[iii].equals(question[iiii])) st++;
						else if(target[iii].equals(question[iiii])) ball++;
					}
				}
				
				//������ ��Ʈ����ũ�� �� ���� ��ġ�ϸ� ���� ��������, �ƴϸ� ����
				if(st == baseball[ii][1] && ball == baseball[ii][2]) continue;
				else {
					isRight = false;
					break;
				}
			}
			
			//��� ��Ʈ����ũ�� �� ���� ��ġ�ϸ� ����
			if(isRight == true) answer++;
		}
		return answer;
	}

}
