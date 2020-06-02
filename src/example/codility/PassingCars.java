package example.codility;

public class PassingCars {

    static int solution(int[] A){
        int sum = 0;
        int res = 0;

        for(int i=0; i<A.length; i++){
            if(A[i]==0){
                sum++;
            }else{
                res += sum;
            }
        }

        if(res<0 || res>1000000000){
            return -1;
        }
        return res;
    }

    public static void main(String[] args) {
        int res = solution(new int[]{0, 1, 0, 1, 1});
        //0,1
        //0,3
        //0,4
        //2,3
        //2,4
    }
}
