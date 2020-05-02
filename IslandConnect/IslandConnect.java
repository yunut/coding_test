package IslandConnect;

import java.util.*;

public class IslandConnect {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 6;
		int[][] costs = {
				{0,1,5},
				{0,3,2},
				{0,4,3},
				{1,4,1},
				{3,4,10},
				{1,2,2},
				{2,5,3},
				{4,5,4}
		};
		
		solution(n,costs);
	}
	
	public static int solution(int n, int[][] costs) {
        int answer = 0;
        boolean[] visited = new boolean[n];
        ArrayList<Integer> map = new ArrayList<>();
        
        
        Arrays.sort(costs,(o1,o2) -> {
            return o1[2] - o2[2];
        });
        
        visited[costs[0][0]] = true;
        map.add(costs[0][0]);
        while(map.size() != n) {
            for(int i=0;i<costs.length;i++) {
                if((!visited[costs[i][1]] && visited[costs[i][0]] && map.contains(costs[i][0])) || (!visited[costs[i][1]] && visited[costs[i][0]] && map.contains(costs[i][1]))) {
                    map.add(costs[i][1]);
                    visited[costs[i][1]] = true;
                    answer += costs[i][2];
                    break;
                }
            }
        }
        
        return answer;
    }

}
