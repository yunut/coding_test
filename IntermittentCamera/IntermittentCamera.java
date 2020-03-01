package IntermittentCamera;

import java.util.*;

public class IntermittentCamera {
	public static void main(String[] args) {
		int[][] routes = { {-20,15},{-14,-5},{-18,-13},{-5,-3}};
		solution(routes);
	}
	
	public static int solution(int[][] routes) {
        int answer = 1;
        
        Arrays.sort(routes, (o1,o2) -> {
				return Integer.compare(o1[1], o2[1]);
		});
        
        int target = routes[0][1];
        for(int i=0;i<routes.length;i++) {
        	if(target >= routes[i][0] && target <= routes[i][1]) {
        		continue;
        	} else {
        		answer++;
        		target = routes[i][1];
        	}
        }
        if(!(target >= routes[routes.length-1][0] && target <= routes[routes.length-1][1])) {
        	answer++;
        }
        System.out.println(answer);
        return answer;
    }
}
