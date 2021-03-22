package example.programmers.정렬.버블정렬;

public class Test {
    public static void main(String[] args) {
        int[] arr = {1, 5, 6, 4, 3, 2, 7, 9, 10, 8};
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr.length-1-i; j++){
                if(arr[j]>arr[j+1]){
                    int tmp = 0;
                    tmp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j]=tmp;
                }
            }
        }
        for (int i : arr) {
            System.out.print(i);
        }
    }
}
