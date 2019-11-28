//package programmers;
//
//import java.util.HashMap;
//import java.util.Map;
//
//public class SkillTree {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		String[] strArry = {"BACDE", "CBADF", "AECB", "BDA"};
//		System.out.println(solution("CBD", strArry));
//		System.out.println(solutionMap("CBD", strArry));
//		
//		
//
//	}
//	
//	public static int solutionMap(String skill, String[] skill_trees) {
//		Map<String, Integer> map = new HashMap<String, Integer>();
//		
//		 
//	}
//	
//	 public static int solution(String skill, String[] skill_trees) {
//		 int answer = 0;
//		 int treeLength = skill_trees.length;
//		 for(int i=0; i<treeLength; i++){ 		//스킬트리만큼.
//		        int skillIndex=0;
//		        boolean flag = true;
//
//		        int treeIdxLength = skill_trees[i].length();
//		        
//		        for(int j=0; j<treeIdxLength; j++){ // 단어만큼.
//
//		            int skillLength = skill.length(); 	//1 인자 문자열 길이.
//		           
//		            for(int k=skillIndex; k<skillLength; k++){
//		                if(skill.charAt(k) == skill_trees[i].charAt(j)){
//		                    if(k!=skillIndex)
//		                        flag = false;
//		                    else
//		                        skillIndex++;
//		                }
//		            }
//		        }
//		        if(flag == true){
//		            answer ++;
//		        }
//		    }
//
//		    return answer;
//	    }
//
//}
