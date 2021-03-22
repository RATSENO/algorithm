package example.leetcode;

import java.util.ArrayList;
import java.util.List;

public class P118 {
    private static List<List<Integer>> generate(int numRows) {
        //파스칼 트라이앵글
        //    1
        //   1  1
        //  1  2  1
        // 1  3  3  1
        //1  4  6  4  1
        List<List<Integer>> allrows = new ArrayList<>();
        ArrayList<Integer> row = new ArrayList<Integer>();
        for(int i=0;i<numRows;i++)
        {
            row.add(0, 1);
            //1을 앞에다 넣음으로써
            //이전 로우의 모습을 계산할수 있다.
            for(int j=1;j<row.size()-1;j++){
                row.set(j, row.get(j)+row.get(j+1));
            }
            allrows.add(new ArrayList<Integer>(row));
        }
        return allrows;
    }

    public static void main(String[] args) {
        generate(5);
    }
}
