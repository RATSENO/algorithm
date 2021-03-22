package example.programmers.정렬.선택정렬;

public class Test {
    public static void main(String[] args) {
        int[] arr = {1, 5, 6, 4, 3, 2, 7, 9, 10, 8};
        int minIdx = 0;
        for(int i=0; i<arr.length; i++){
            int min = Integer.MAX_VALUE;
            for(int j=i; j<arr.length; j++){
                if(min>arr[j]){
                    min = arr[j];
                    minIdx = j;
                }
            }
            int temp = 0;
            temp = arr[i];
            arr[i] = arr[minIdx];
            arr[minIdx]=temp;
        }
        for (int i : arr) {
            System.out.print(i);
        }
    }
}
