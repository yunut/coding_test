package DiskController;

import java.util.*;

public class DiskController {
	public static void main(String[] args) {
		int[][] jobs = {{0,3},{1,9},{2,6}};
		solution(jobs);
	}
	
	public static int solution(int[][] jobs) {
        int answer = 0;
        int time=0;
        int controlltime=0;
        int i=0;
        PriorityQueue<job> q = new PriorityQueue<>(jobs.length,new Comparator<job>() {
        	@Override
        	public int compare(job o1, job o2) {
        		if(o1.getOut() > o2.getOut()) return 1;
        		else return -1;
        	};
        
        });
        
        
        while(i < jobs.length || !q.isEmpty()) {
            for(int ii=i;ii<jobs.length;ii++) {
                if(jobs[ii][0] <= time) {
                    q.offer(new job(jobs[i][0],jobs[i][1]));
                    i++;
                } else break;
            }
            if(!q.isEmpty()) {
                
                controlltime += time - q.peek().getInput() + q.peek().getOut();
                time+=q.peek().getOut();
                q.poll();
            }
        }
        
        answer = controlltime / jobs.length;
        System.out.println(answer);
        return answer;
    }
}
class job {
	
	private int input;
	private int out;
	
	job(int input, int out) {
		this.input = input;
		this.out = out;
	}
	
	public int getInput() {
		return input;
	}

	public void setInput(int input) {
		this.input = input;
	}

	public int getOut() {
		return out;
	}

	public void setOut(int out) {
		this.out = out;
	}
}
