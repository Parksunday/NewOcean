package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String [] b = {"enyky",
                "benyky",
                "yely",
                "varennyky"};

        allLongestStrings(b);

    }


    public  static  String[] allLongestStrings(String[] inputArray) {
        if(inputArray.length==1){
            return  inputArray;
        }

        ArrayList<String> list = new ArrayList<>();
        int longestString = 1;
        int numberOfLongest = 0;
        for(int i = 0;i<inputArray.length;i++){
            if(inputArray[i].length()>longestString){
                longestString = inputArray[i].length();
            }
        }
        for(int i = 0;i<inputArray.length;i++) {
            if(inputArray[i].length()==longestString){
                numberOfLongest+=1;
                list.add(inputArray[i]);
            }

        }
        String[] a = new String[numberOfLongest];
        for(int i =0;i<a.length;i++){
            a[i] = list.get(i);
        }

        return  a;
    }




}
