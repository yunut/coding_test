package SkillTree;

public class SkillTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String skill = "CBD";
		String[] skill_trees = {"BACDE","CBADF","AECB","BDA"};
		
		solution(skill,skill_trees);
	}
	
	public static int solution(String skill, String[] skill_trees) {
        int answer = 0;
        
        for(int i=0;i<skill_trees.length;i++) {
            Boolean isRight = true;
            int count = 0;
            for(int ii=0;ii<skill_trees[i].length();ii++) {
                if(!skill.contains(Character.toString(skill_trees[i].charAt(ii)))) {
                    continue;
                } else {
                    if(skill.charAt(count) == skill_trees[i].charAt(ii)) {
                        count++;
                    } else {
                        isRight = false;
                        break;
                    }
                }
            }
            if(isRight == true) {
                answer++;
            }
        }
        
        Character.toString(c)
        return answer;
    }

}
