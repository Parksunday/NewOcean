package HRank;

public class DiagonalDifferent {

    public static int diagonalSum(int[][] input) {
        int count = 0;
        for (int i = 0; i < input.length; i++) {
            for (int j = 0; j < input[i].length; j++) {
                if (i == j) {
                    count = count + input[i][j];
                }
            }
        }
        return count;
    }

    public static int[][] reverseArray(int[][] input) {
        int[][] reverse = new int[input.length][input.length];
        for (int i = 0; i < input.length; i++) {
            for (int j = 0; j < input[i].length; j++) {
                reverse[i][input.length-1-j]=input[i][j];
            }
        }
        return reverse;
    }

    static int diagonalDifference(int[][] arr) {

        int a = diagonalSum(arr);
        int [ ][ ] rev = reverseArray(arr);
        int b = diagonalSum(rev);

        int result = Math.abs(a-b);
        return result;

    }
    public static void main(String[]args){
        int [][] a = {{1,2,3},{1,2,3},{5,9,7}};
        int [][] b  = reverseArray(a);

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
               System.out.print(b[i][j]);
            }
            System.out.println();
        }





    }
}
