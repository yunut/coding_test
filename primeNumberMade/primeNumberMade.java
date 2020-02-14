package primeNumberMade;

import java.util.*;

public class primeNumberMade {
	
	private static HashSet<Integer> set = new HashSet<>();
    private static int max;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,2,7,6,4};
		solution(nums);
	}
	
	public static int solution(int[] nums) {
        int answer = 0;
        int target=0;
        max = 0;
        
        for(int i=0;i<nums.length;i++) {
            dfs(nums,0,0,i);
        }
        
        Iterator<Integer> it = set.iterator();
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=2;i<=max;i++) {
            arr.add(i);
        }
        for(int i=2;i<=max/2;i++) {
            for(int ii=0;ii<arr.size();ii++) {
                if(arr.get(ii) != i && arr.get(ii) % i == 0) {
                    arr.set(ii,0);
                }
            }
        }
        while(it.hasNext()) {
            if(arr.contains(it.next())) {
                answer++;
            } 
        }
        System.out.println(answer);
        return answer;
    }
	
	public static void dfs(int[] nums,int sum,int count,int index) {
        if(count == 3) {
            if(max < sum) max = sum;
            set.add(sum);
            return;
        }
        
        if(index >= nums.length) {
        	return;
        }
        
        sum+=nums[index];
        
        for(int i=index+1;i<=nums.length;i++) {
            dfs(nums,sum,count+1,i);
        }
        
    }

}
