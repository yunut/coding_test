package CaesarPassword;

public class CaesarPassword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		solution("AB",1);
	}
	
	public static String solution(String s, int n) {
		  String answer = "";
	      StringBuilder str = new StringBuilder();
	      str.append(s);

	      for(int i=0;i<str.length();i++) {
	          char tmp = str.charAt(i);
	          //소문자일때
	          if((tmp != 32) && Character.isLowerCase(tmp)) {
	              str.replace(i,i+1,Character.toString((char) (str.charAt(i) + n)));
	              if(str.charAt(i) > 122) {
		              str.replace(i,i+1,Character.toString((char) (str.charAt(i) - 26)));
		          }
	          }
	          
	          
	          //대문자일때
	          if((tmp != 32) && Character.isUpperCase(tmp)) {
	              str.replace(i,i+1,Character.toString((char) (str.charAt(i) + n)));
	              if(str.charAt(i) > 90) {
		              str.replace(i,i+1,Character.toString((char) (str.charAt(i) - 26)));
		          }
	          }
	          
	      }

	      for(int i=0;i<str.length();i++) {
	          answer = str.toString();
	      }
	      return answer;
	  }

}
