package example.leetcode;

public class P58 {

    private static int lengthOfLastWord(String s) {
        String[] arr = s.split(" ");
        if(arr.length==0){
            return 0;
        }
        String str = arr[arr.length-1];
        return str.length();
    }

    public static void main(String[] args) {
        int hello_world = lengthOfLastWord("Hello World");
        int i = lengthOfLastWord(" ");
    }


}
