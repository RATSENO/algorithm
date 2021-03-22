package example.programmers.체육복;

public class Solution {

    private static int solution(int n, int[] lost, int[] reserve) {
        int[] people = new int[n];
        int answer = n;

        for (int l : lost)
            people[l-1]--;
        for (int r : reserve)
            people[r-1]++;

        for (int i = 0; i < people.length; i++) {
            //옷을 도둑 맞은 사람
            if(people[i] == -1) {
                //첫번째 사람이 아니고, 그 앞 사람이 여분의 옷을 가지고 있을 때
                if(i-1>=0 && people[i-1] == 1) {
                    //옷을 얻었으니까 ++
                    people[i]++;
                    //앞사람이 옷을 줬으니까 --
                    people[i-1]--;
                //뒷사람이 옷이 있을때
                }else if(i+1< people.length && people[i+1] == 1) {
                    //옷을 얻었으니까 ++
                    people[i]++;
                    //뒷사람이 옷을 줬으니까 --
                    people[i+1]--;
                }else
                    //그외에는 --
                    answer--;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        int solution = solution(5, new int[]{2,4}, new int[]{1,3,5});
    }
}
