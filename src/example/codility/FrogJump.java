package example.codility;

public class FrogJump {
    public static int solution(int X, int Y, int D) {
        if(X<1 || X>1000000000){
            return 0;
        }

        if(Y<1 || Y>1000000000){
            return 0;
        }

        if(D<1 || D>1000000000){
            return 0;
        }

        if(X>Y){
            return 0;
        }

        int res = 0;
        int distance = Y-X;
        if(distance % D ==0){
            return distance / D;
        }else{
            return ((distance/D)+1);
        }


    }

    public static void main(String[] args) {
        int res = solution(10, 85, 30);
    }
}
