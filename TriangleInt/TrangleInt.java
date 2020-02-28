package TriangleInt;

public class TrangleInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] triangle = {{0},{3,8},{8,1,0},{2,7,4,4},{4,5,2,6,5}};
		solution(triangle);
	}
	
	public static int solution(int[][] triangle) {
        int answer = 0;
        int i=triangle.length-2;
        while(i>=0) {
            for(int ii=0;ii<triangle[i].length;ii++) {
                if(triangle[i][ii] + triangle[i+1][ii] >= triangle[i][ii] + triangle[i+1][ii+1]) triangle[i][ii] += triangle[i+1][ii];
                else triangle[i][ii] += triangle[i+1][ii+1]; 
            }
            i--;
        }
        answer = triangle[0][0];
        return answer;
    }

}
