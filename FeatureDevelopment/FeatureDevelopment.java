package FeatureDevelopment;

import java.util.*;

public class FeatureDevelopment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] progresses = {93,30,55};
		int[] speeds = {1,30,5};
		
		solution(progresses,speeds);
	}
	
	public static int[] solution(int[] progresses, int[] speeds) {
        int[] answer;
        ArrayList<Integer> arr = new ArrayList<>();
        int IndexCount=0;
        int AnswerCount=0;
        
        
        while(IndexCount < progresses.length) {
            
            //����Ŭ���� speeds��ŭ�� �۾��� +
            for(int i=0;i<progresses.length;i++) {
                progresses[i] += speeds[i];
            }
            
            //�� ����Ŭ���� �Ϸ��� �۾��� ������, �������� +
            for(int i=IndexCount;i<progresses.length;i++) {
                if(progresses[i] >= 100) {
                    AnswerCount++;
                    IndexCount++;
                } else {
                    break;
                }
            }
            
            //�����Ұ��������� ����Ʈ�� �߰�
            if(AnswerCount > 0) {
                arr.add(AnswerCount);
                AnswerCount=0;
            } 
        }
        
        //return�� int[] �迭�� �߰�
        answer= new int[arr.size()];
        for(int i=0;i<arr.size();i++) {
            answer[i] = arr.get(i);
        }
        
        return answer;
    }

}
