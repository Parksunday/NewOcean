package com.company;

public class Minesweeper {
    public static void main (String[]args){

    }

     public static int[][] minesweeper(boolean[][] matrix) {
        int [][] plus = new int[matrix.length][matrix[0].length];

        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                for(int x= i-1;x<i+2;x++){
                    for(int y=j-1;y<j+2;j++){
                        if(x>=0 && x<matrix.length && y>=0 && y<matrix[i].length && !(x==i && y==j) && matrix[x][y]){
                            plus[i][j]++;
                        }
                    }
                }
            }
        }
        // (0,0) (0,1) (0,2
         //)
         //(1,0)
        return plus;

     }
}
