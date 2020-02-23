package primeNumberMade;

import java.util.*;

public class primeNumberMade {
	
	private static int answer;
	private static ArrayList<Integer> arr;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,2,7,6,4};
		solution(nums);
	}
	
	public static int solution(int[] nums) {
        answer = 0;
        int target=0;
        
        arr = new ArrayList<>();
        
        for(int i=2;i<=3000;i++) {
            arr.add(i);
        }
        
        for(int i=2;i<=1500;i++) {
            for(int ii=0;ii<arr.size();ii++) {
                if(arr.get(ii) != i && arr.get(ii) % i == 0) {
                    arr.remove(ii);
                }
            }
        }
        
        for(int i=0;i<nums.length-2;i++) {
            for(int ii=i+1;ii<nums.length-1;ii++) {
                for(int iii=ii+1;iii<nums.length;iii++) {
                    int check = nums[i] + nums[ii] + nums[iii];
                    if(arr.contains(check)) {
                        answer++;
                    }
                }
            }
        }
        
        return answer;
    }

}
