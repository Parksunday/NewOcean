package com.company;

public class AvoidObstacle {
    public static void main(String[] args) {

    }

   public static int avoidObstacles(int[] inputArray) {
        int count =1;

           for(int i=0;i<inputArray.length;i++){
               if(inputArray[i]%count==0){
                   count++;
                   i=0;
               }

       }

        return count;

    }
}