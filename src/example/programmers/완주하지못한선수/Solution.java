package example.programmers.완주하지못한선수;

import java.util.HashMap;

public class Solution {

    private static String solution(String[] participant, String[] completion) {
        String answer = "";

        int cnt = 0;
        HashMap<String, Integer> map = new HashMap<>();
        for (String part : participant) {
            Integer integer = map.get(part);
            if(integer == null){
                map.put(part, 1);
            }else{
                map.put(part, integer+1);
            }
        }

        for (String comp : completion) {
            Integer integer = map.get(comp);
            if(integer != null){
                map.put(comp, integer-1);
            }
        }

        for (String key : map.keySet()) {
            Integer integer = map.get(key);
            if(integer == 1){
                answer = key;
            }
        }
        return answer;
    }


    public static void main(String[] args) {
        String solution = solution(new String[]{"leo", "kiki", "eden"}, new String[]{"kiki", "eden"});
        String solution1 = solution(new String[]{"marina", "josipa", "nikola", "vinko", "filipa"}, new String[]{"josipa", "filipa", "marina", "nikola"});
        String solution2 = solution(new String[]{"mislav", "stanko", "mislav", "ana"}, new String[]{"stanko", "ana", "mislav"});
    }
}

