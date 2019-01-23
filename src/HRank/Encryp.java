package HRank;

public class Encryp {
    static String encryption(String s) {
        String input = s.replaceAll(" ", "");
        int len = input.length();
        double root = Math.sqrt(len);

        int down = (int) root; //row

        double testNumber = (double) down;

        int up = (int) (root + ((root % testNumber == 0) ? 0 : 1)); //column

        if (up * down < len) {
            down++;
        }

        String[][] array = new String[down][up];

        int count = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (count < input.length()) {
                    array[i][j] = Character.toString(input.charAt(count++));
                } else {
                    array[i][j] = "";
                }
            }
        }
        String out = "";
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                //System.out.print(array[i][j]);
            }
            //System.out.println();
        }

        for (int j = 0; j < up; j++) {
            for (int i = 0; i < down; i++) {
                out = out + array[i][j];
            }
           out = out+ " ";
        }


       return out;


    }

    public static void main(String[] args) {
        encryption("chillout");
    }
}
