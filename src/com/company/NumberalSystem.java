package com.company;

public class NumberalSystem {
    public static void main(String[] args) {
        String re ="(aabx)";

        System.out.print(reverseParentheses(re));
    }
    public static String reverseParentheses (String a){
        int lastIndexofLeft =a.lastIndexOf("(");
        while(lastIndexofLeft!=-1){
            int firstIndexofRight = a.indexOf(")",lastIndexofLeft);
            String cut = a.substring(0,lastIndexofLeft);
            cut += new StringBuffer(a.substring(lastIndexofLeft+1,firstIndexofRight))
                       .reverse().toString();
            cut += a.substring(firstIndexofRight+1);
            a= cut;
            lastIndexofLeft =a.lastIndexOf("(");



        }

        return a;
    }



}
