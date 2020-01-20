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
	    	  if((str.charAt(i) != 32)) {
	    		  str.replace(i,i+1,Character.toString((char) (str.charAt(i) + n)));
	    	  }
	    	  if(str.charAt(i) > 90) {
	    		  str.replace(i,i+1,Character.toString((char) (str.charAt(i) - 25)));
	    	  }
	    	  if(str.charAt(i) > 122) {
	    		  str.replace(i,i+1,Character.toString((char) (str.charAt(i) - 25)));
	    	  }
	      }
	      
	      for(int i=0;i<str.length();i++) {
	    	  answer = str.toString();
	      }
	      return answer;
	  }

}
