package com.company;

public class boardChessColor {

   static boolean chessBoardCellColor(String cell1, String cell2) {

        String cellRow1 = cell1.substring(0, 1);
        int cellColor1 = Integer.parseInt(cell1.substring(1));

        String cellRow2 = cell2.substring(0, 1);
        int cellColor2 = Integer.parseInt(cell2.substring(1));
        boolean x = true;

        //case 1
        if (cellRow1.equals("A") || cellRow1.equals("C") || cellRow1.equals("E") || cellRow1.equals("G")) {
            //case1-1
            if (cellRow2.equals("A") || cellRow2.equals("C") || cellRow2.equals("E") || cellRow2.equals("G")) {
                if ((cellColor1 % 2) == (cellColor2 % 2)) {
                   x =true;
                } else {
                   x =false;
                }
            } else {

                //case1-2

                if ((cellColor1 % 2) == (cellColor2 % 2)) {
                    x =false;
                } else {
                  x= true;
                }


            }


        }else{

            if (cellRow2.equals("A") || cellRow2.equals("C") || cellRow2.equals("E") || cellRow2.equals("G")) {
                if ((cellColor1 % 2) == (cellColor2 % 2)) {
                    x =false;
                } else {
                   x= true;
                }
            } else if(cellRow2.equals("B") || cellRow2.equals("D") || cellRow2.equals("F") || cellRow2.equals("H"))  {

                //case1-2

                if ((cellColor1 % 2) == (cellColor2 % 2)) {
                   x= true;
                } else {
                   x =false;
                }


            }


        }
        return x;
    }

    public static void main(String[]args){
        System.out.print(chessBoardCellColor("G5","E7"));
    }
}