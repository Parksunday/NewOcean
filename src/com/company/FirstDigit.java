package com.company;

import java.util.HashSet;
import java.util.Set;

public class FirstDigit {
    char firstDigit(String inputString) {
        for(int i=0;i<inputString.length();i++){
            if(Character.isDigit(inputString.charAt(i))){
                return inputString.charAt(i);
            }
        }
        return '0';
    }
    public static int  differentSymbolsNaive(String s) {
        //set no contain duplicated
        Set<Character> dup = new HashSet<>();
        StringBuilder result = new StringBuilder();
        for(int i =0;i<s.length();i++){
            dup.add(s.charAt(i));
        }
        dup.forEach(result::append);

        return result.length();
    }
    public static void main (String[]args){
        int x = differentSymbolsNaive("avaa");
        System.out.print(x);
    }

}
