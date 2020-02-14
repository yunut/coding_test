package JadenCase;

public class JadenCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "3people unFollowed me";
		solution(s);
	}
	
	public static String solution(String s) {
		  String answer = "";
	      s = s.toLowerCase();
	      String[] tmp = s.split("");
	      System.out.println(s);
	      
	      tmp[0] = tmp[0].toUpperCase();
	      for(int i=1;i<tmp.length;i++) {
	          if(tmp[i-1].equals(" ")) {
	              tmp[i] = tmp[i].toUpperCase();
	          }
	      }
	      for(int i=0;i<tmp.length;i++) {
	          answer += tmp[i];
	      }
	      System.out.println(answer);
	      return answer;
	  }

}
