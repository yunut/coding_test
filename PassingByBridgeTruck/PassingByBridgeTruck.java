package PassingByBridgeTruck;

import java.util.*;

public class PassingByBridgeTruck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int bridge_length = 2;
		int weight = 10;
		int[] truck_weights = {7,4,5,6};
		solution(bridge_length,weight,truck_weights);
	}
	
	public static int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 1;
        int waitIndex = 0;
        int truckIndex = 0;
        int weightCount=0;
        Queue<Truck> q1 = new LinkedList<>();
        Truck[] trucks = new Truck[truck_weights.length];
        
        for(int i=0;i<trucks.length;i++) {
        	trucks[i] = new Truck(bridge_length,truck_weights[i]);
        }
        
        q1.offer(trucks[0]);
        weightCount += truck_weights[waitIndex];
        waitIndex++;
        while(!q1.isEmpty() || waitIndex < truck_weights.length) {
        	answer++;
        	for(Truck truck : q1) {
        		truck.time--;
        	}
        	
        	if(trucks[truckIndex].time == 0) {
            	truckIndex++;
            	weightCount -= q1.poll().weight;
            } 
        	
        	if(waitIndex < truck_weights.length) {
	            if(weight >= weightCount + truck_weights[waitIndex]) {
	                q1.offer(trucks[waitIndex]);
	                weightCount += truck_weights[waitIndex];
	                waitIndex++;
	            }
        	}
            
               

        }
        System.out.println(answer);
        return answer;
    }
	
	

}

class Truck {
	int time;
	int weight;
	
	public Truck(int time, int weight) {
		this.time = time;
		this.weight = weight;
	}
}
