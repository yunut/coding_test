package StrangeCharacter;

public class StrangeCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		solution("try hello  world");
	}
	
	 public static String solution(String s) {
	      String answer = "";
	      String[] tmp = s.split("\\s", -1);
	      
	      for(int i=0;i<tmp.length;i++) {
	          for(int ii=0;ii<tmp[i].length();ii++) {
	              if(ii % 2 == 0) {
	                  answer += Character.toString(tmp[i].charAt(ii)).toUpperCase();
	              } else {
	                  answer += Character.toString(tmp[i].charAt(ii)).toLowerCase();
	              }
	          }
	          if(i != tmp.length-1 ){
	              answer += " ";
	          }
	      }
	      return answer;
	  }

}
