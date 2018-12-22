package com.company;

public class StringArrangement {

    public static void main(String[]args){
        String [] a = {"Ac","Bc"};

    }

    protected boolean stringsRearrangement(String[] inputArray) {

        boolean[] used = new boolean[inputArray.length];
        permuteArray(inputArray, null, used, 0);
        return checkSucess;
    }

    public static boolean checkSucess = false;

    public static boolean differByOne(String a, String b) {
        int count = 0;
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) != b.charAt(i)) {
                count++;
            }
        }
        return count == 1;
    }


    public static void permuteArray(String[]a, String previous, boolean[]used, int n){
        if (n == a.length) {
            checkSucess = true;
            return;
        }
        for (int i = 0; i < a.length; i++) {
            if (!used[i] && (previous == null || differByOne(previous, a[i]))) {
                used[i] = true;
                permuteArray(a, a[i], used, n+1);
                used[i] = false;
            }
        }
    }

}
