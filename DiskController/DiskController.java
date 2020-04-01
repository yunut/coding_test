package DiskController;

import java.util.*;

public class DiskController {
	public static void main(String[] args) {
		int[][] jobs = {{0,3},{0,1},{4,7}};
		solution(jobs);
	}
	
	 public static int solution(int[][] jobs) {
        int answer = 0;
        int time=0; // 현재 진행 시간
        int controlltime=0; // 총 처리 시간
        int i=0; // 인덱스
        
        //우선순위 큐를 나가는 시간이 빠른것으로 정렬
        PriorityQueue<job> q = new PriorityQueue<>(jobs.length,new Comparator<job>() {
        	@Override
        	public int compare(job o1, job o2) {
                return o1.getOut() - o2.getOut();
        	};
        
        });
        
        //입력시간대로 정렬
        Arrays.sort(jobs,(o1,o2) -> { return Integer.compare(o1[0],o2[0]);});
        
        
        
        while(i < jobs.length || !q.isEmpty()) {
            //현재 처리시간보다 작은 요청시간은 큐로 넣음
            for(int ii=i;ii<jobs.length;ii++) {
                if(jobs[ii][0] <= time) {
                    q.offer(new job(jobs[i][0],jobs[i][1]));
                    i++;
                // 현재시간보다 요청시간이 더 많이있는경우 현재시간을 요청시간으로 만듦
                } else if(q.isEmpty()) {
                    time += jobs[i][0] - time;
                    break;
                };
            }
            //처리시간 내에 큐가 있으면 처리
            if(!q.isEmpty()) {
                controlltime += time - q.peek().getIn() + q.peek().getOut();
                time+=q.peek().getOut();
                q.poll();
            }
        }
        
        
        answer = controlltime / jobs.length;
        return answer;
    }
}
class job {
	
	private int in;
	private int out;
	
	job(int in, int out) {
		this.in = in;
		this.out = out;
	}
	
	public int getIn() {
		return in;
	}

	public void setIn(int input) {
		this.in = in;
	}

	public int getOut() {
		return out;
	}

	public void setOut(int out) {
		this.out = out;
	}
}