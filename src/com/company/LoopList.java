package com.company;

import java.util.ArrayList;
import java.util.List;

public class LoopList {
    static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        int aScore =0;
        int bScore =0;

        for(int i =0;i<a.size();i++){
            if(a.get(i)>b.get(i)){
                aScore+=1;
            }else if(a.get(i)<b.get(i)){
                bScore+=1;
            }
        }
        List<Integer>score = new ArrayList<>();
        score.add(aScore);
        score.add(bScore);

        return score;




    }
}
