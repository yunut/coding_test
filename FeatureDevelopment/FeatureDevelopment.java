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
            
            //사이클마다 speeds만큼의 작업량 +
            for(int i=0;i<progresses.length;i++) {
                progresses[i] += speeds[i];
            }
            
            //각 사이클마다 완료한 작업이 있을시, 배포개수 +
            for(int i=IndexCount;i<progresses.length;i++) {
                if(progresses[i] >= 100) {
                    AnswerCount++;
                    IndexCount++;
                } else {
                    break;
                }
            }
            
            //배포할것이있으면 리스트에 추가
            if(AnswerCount > 0) {
                arr.add(AnswerCount);
                AnswerCount=0;
            } 
        }
        
        //return용 int[] 배열에 추가
        answer= new int[arr.size()];
        for(int i=0;i<arr.size();i++) {
            answer[i] = arr.get(i);
        }
        
        return answer;
    }

}
