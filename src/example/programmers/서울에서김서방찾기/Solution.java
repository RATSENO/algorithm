package example.programmers.서울에서김서방찾기;

public class Solution {
    public static String solution(String[] seoul) {
        String answer = "";
        for(int i=0; i<seoul.length; i++){
            if(seoul[i].equals("Kim")){
                answer = "김서방은 " + i + "에 있다.";
            }
        }


        return answer;
    }

//
//    public String findKim(String[] seoul){
//        //x에 김서방의 위치를 저장하세요.
//        int x = Arrays.asList(seoul).indexOf("Kim");
//
//        return "김서방은 "+ x + "에 있다";
//    }

    public static void main(String[] args) {
        String solution = solution(new String[]{"Jane", "Kim"});
    }
}
