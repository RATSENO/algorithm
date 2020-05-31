package example.HackerRank;

import java.util.ArrayList;
import java.util.List;

public class CompareTheTriplets {

    static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        List<Integer> res = new ArrayList<>();

        int cnt = a.size();

        int alice = 0;
        int bob = 0;

        for(int i=0; i<cnt; i++){
            if(a.get(i) > b.get(i)){
                alice++;
            }

            if(a.get(i) == b.get(i)){
                continue;
            }

            if(a.get(i) < b.get(i)){
                bob++;
            }
        }
        res.add(alice);
        res.add(bob);
        return  res;
    }


    public static void main(String[] args) {

    }
}
