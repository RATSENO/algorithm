package example.programmers.정수내림차순으로배치하기;

import java.util.Arrays;

public class Solution {
    public static long solution1(long n) {
        //버블정렬
        long answer = 0;
        String s = String.valueOf(n);
        long[] longs = Arrays.stream(s.split("")).mapToLong(i -> Long.parseLong(i)).toArray();
        for(int i=0; i<longs.length; i++){
            for(int j=i+1; j<longs.length; j++){
                if(longs[i]<longs[j]){
                    long tmp = longs[i];
                    longs[i] = longs[j];
                    longs[j]=tmp;
                }
            }
        }
        for(int i=0; i<longs.length; i++){
            answer += longs[i]* Math.pow(10, longs.length-1-i);
        }
        return answer;
    }

    public static long solution2(long n) {
        return 0;
    }

    public static long solution3(long n) {
        return 0;
    }


    /*
    public long solution(long n) {
        long answer = 0;

        String nStr = String.valueOf(n);
        *//**
         * Collections.reverseOrder()를 사용하기 위해 Integer로 선언
         *//*
        Integer[] arrs = new Integer[nStr.length()];

        for (int i = 0; i < nStr.length(); i++) {
            arrs[i] = nStr.charAt(i) - 48;
        }

        *//**
         * 내림차순 정렬
         *//*
        Arrays.sort(arrs, Collections.reverseOrder());

        for (int i = 0; i < arrs.length; i++) {
            answer += arrs[i] * Math.pow(10, arrs.length - 1 - i);
        }

        return answer;
    }*/

    public static void main(String[] args) {
        long l = solution1(118372);
        long l1 = solution2(118372);
        long l2 = solution3(118372);
    }
}
