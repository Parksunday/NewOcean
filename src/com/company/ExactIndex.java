package com.company;

import java.util.ArrayList;

public class ExactIndex {
    public static int[] extractEachKth(int[] inputArray, int k) {
        int count =0;
        ArrayList<Integer> a = new ArrayList<>();
        for(int i =0;i<inputArray.length;i++){
            if(inputArray[i]!=k){
                a.add(inputArray[i]);
            }
        }
        int len = a.size();
        int b [] = new int [len];
        for(int i =0;i<b.length;i++){
            b[i]=a.get(i);
        }
       return b;
    }

    public static void main (String[]args){
        int [] y = {1,2,3,4};
        int[] x = extractEachKth(y,1);

    }





}

