package example.programmers.정렬.삽입정렬;

public class Test {
    public static void main(String[] args) {
        int[] arr = {1, 5, 6, 4, 3, 2, 7, 9, 10, 8};
        int j=0;
        int tmp=0;
        for(int i=0; i<arr.length-1; i++){
            j=i;
            while (arr[j]>arr[j+1]){
                tmp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=tmp;
                j--;
            }
        }
    }
}
