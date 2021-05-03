package example.leetcode;

public class P204 {
    private static int countPrimes(int n) {
        int cnt = 0;
        boolean[] arr = new boolean[n];
        for(int i=2; i<n; i++){
            if(arr[i]==false){
                cnt++;
                for(int j=2; i*j<n; j++){
                    arr[i*j]=true;
                }
            }
        }
        return cnt;
    }

    public static void main(String[] args) {
        int i = countPrimes(10);
    }
}
