package Printer;

import java.util.*;
import java.awt.Point;

public class Printer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] priorites = {1,1,9,1,1,1};
		int location = 0;
		solution(priorites, location);
	}
	
	static int solution(int[] priorities, int location) {
		int answer = 0;
        PriorityQueue<Integer> q = new PriorityQueue<>(Collections.reverseOrder());
        
        for(int i=0;i<priorities.length;i++) {
            q.add(priorities[i]);
        }
        
        while(!q.isEmpty()) {
            for(int i=0;i<priorities.length;i++) {
            	if(q.peek() == priorities[i]) {
            		if(i == location) {
                		return answer;
                	}
            		q.poll();
            		answer++;
            	}
            	
            }
        }
        System.out.println(answer);
        return answer;
    }

}
