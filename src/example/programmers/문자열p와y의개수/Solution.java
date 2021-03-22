package example.programmers.문자열p와y의개수;

import java.util.HashMap;

public class Solution {
    public static boolean solution(String s) {
        boolean answer = false;
        String lowerCase = s.toLowerCase();
        HashMap<Character, Integer> characterIntegerHashMap = new HashMap<>();

        for(int i=0; i<lowerCase.length(); i++){
            char c = lowerCase.charAt(i);
            Integer integer = characterIntegerHashMap.get(c);
            if(c==(char)'p' || c==(char)'y'){
                if(integer != null){
                    characterIntegerHashMap.put(c,integer+1);
                }else{
                    characterIntegerHashMap.put(c,1);
                }
            }
        }
        if(characterIntegerHashMap.size() != 2){
            answer = true;
        }else{
            Integer p = characterIntegerHashMap.get('p');
            Integer y = characterIntegerHashMap.get('y');
            if(p==y){
                answer = true;
            }
        }
        return answer;

    }
    /*
    boolean solution(String s) {
        boolean answer = true;
        char[] charArr = s.toCharArray();
        int p = 0, y = 0;
        for (int i = 0; i < charArr.length; i++) {
            String tmp = String.valueOf(charArr[i]).toLowerCase();
            if ("p".equals(tmp)){
                p++;
            }
            if ("y".equals(tmp)){
                y++;
            }
        }
        if (p != y){
            answer = false;
        }
        return answer;
    }
    */
    public static void main(String[] args) {
        boolean pPoooyY = solution("pPoooyY");
        boolean pyy = solution("Pyy");
    }
}
