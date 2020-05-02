package FailureRate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class FailureRate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N = 5;
		int[] stages = {2,1,2,6,2,4,3,3};
		solution(N,stages);
	}
	
	public static int[] solution(int N, int[] stages) {
		int[] answer = new int[N];
        ArrayList<Stage> stage = new ArrayList<>();
        int allUser = stages.length;
        int index=0;
        int target = 1;
        Arrays.sort(stages);
        
        while(target <= N) {
            int nowStageUser=0;
            for(int i=index;i<stages.length;i++) {
                if(stages[i] == target) nowStageUser++;
                else {
                    index=i;
                    break;
                }
            }
            if(nowStageUser == 0) stage.add(new Stage(target,nowStageUser));
            else stage.add(new Stage(target, (double) nowStageUser / allUser));
            allUser -= nowStageUser;
            target++;
        }
        Collections.sort(stage);
        for(int i=0;i<stage.size();i++) {
            answer[i] = stage.get(i).getNum();
        }
        return answer;
    }

}

class Stage implements Comparable<Stage> {
    private int num;
    private double fail;
    
    public Stage(int num, double fail) {
        this.num = num;
        this.fail = fail;
    }
    
    public int getNum() {
        return num;
    }
    
    @Override
    public int compareTo(Stage s) {
        if(this.fail < s.fail) return 1;
        else if(this.fail > s.fail) return -1;
        else if(this.num < s.num) return 1;
        else return 0;
    }
}
