package com.company;

public class Addborder {
    public static void main(String[]args){
        String [] a = {"dff" , "dsf"};
        addBorder(a);

    }
    public static String[] addBorder (String [] in){

        // length of input string
        int in_length = in[0].length();

        // create new Array
        String [] reArray = new String [in.length+2];

        reArray[0]= "";
        reArray[reArray.length-1]="";
        for(int i=0;i<in_length+2;i++){
            reArray[0]+= "*";
            reArray[reArray.length-1]+= "*";

        }

        //Add *

        for(int i=0;i<in.length;i++){
            in[i] = "*"+in[i]+"*";
        }

        int index =0;
        for(int i =1;i<reArray.length-1;i++){
            reArray[i] =in[index];
            index++;
        }






        return reArray;
    }
}
