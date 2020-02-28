package FailureRate;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

public class FailureRate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N = 5;
		int[] stages = {2,1,2,6,2,4,3,3};
		solution(N,stages);
	}
	
	public static int[] solution(int N, int[] stages) {
        int[] answer = {};
        int stageLen = stages.length;
        HashMap<Integer,Double> sm = new HashMap<>(); 
        int target=0;
        int count=1;
        Integer[] stagesTmp = Arrays.stream(stages).boxed().toArray(Integer[]::new);
        Arrays.sort(stagesTmp,Collections.reverseOrder());
        
        target = stagesTmp[0];
        for(int i=1;i<stagesTmp.length;i++) {
        	if(target != stagesTmp[i]) {
        		sm.put(target,(double) (count/stages.length));
        		target = stagesTmp[i];
        		stageLen -= count;
        		count=1;
        	} else {
        		if(i == stagesTmp.length-1) {
        			sm.put(stagesTmp[i],(double) (count/stages.length));
        		} else {
        			count++;
        		}
        	}
        }
        
        return answer;
    }

}
