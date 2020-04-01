package DiskController;

import java.util.*;

public class DiskController {
	public static void main(String[] args) {
		int[][] jobs = {{0,3},{0,1},{4,7}};
		solution(jobs);
	}
	
	 public static int solution(int[][] jobs) {
        int answer = 0;
        int time=0; // ���� ���� �ð�
        int controlltime=0; // �� ó�� �ð�
        int i=0; // �ε���
        
        //�켱���� ť�� ������ �ð��� ���������� ����
        PriorityQueue<job> q = new PriorityQueue<>(jobs.length,new Comparator<job>() {
        	@Override
        	public int compare(job o1, job o2) {
                return o1.getOut() - o2.getOut();
        	};
        
        });
        
        //�Է½ð���� ����
        Arrays.sort(jobs,(o1,o2) -> { return Integer.compare(o1[0],o2[0]);});
        
        
        
        while(i < jobs.length || !q.isEmpty()) {
            //���� ó���ð����� ���� ��û�ð��� ť�� ����
            for(int ii=i;ii<jobs.length;ii++) {
                if(jobs[ii][0] <= time) {
                    q.offer(new job(jobs[i][0],jobs[i][1]));
                    i++;
                // ����ð����� ��û�ð��� �� �����ִ°�� ����ð��� ��û�ð����� ����
                } else if(q.isEmpty()) {
                    time += jobs[i][0] - time;
                    break;
                };
            }
            //ó���ð� ���� ť�� ������ ó��
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