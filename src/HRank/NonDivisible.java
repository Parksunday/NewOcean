package HRank;

import java.util.ArrayList;
import java.util.List;

public class NonDivisible {

    static int nonDivisibleSubset(int k, int[] S) {

        //divisible every number to see the reminder
        int[] remain = new int[S.length];

        for(int i=0;i<remain.length;i++) {

            //mod the number in input subset and set as an index
            //To see which number has a duplication

            remain[S[i] % k]++;
        }

        // only one number can be present. ly 1 such number can be in the resulting subset, because if you take 2 numbers evenly divisible by k, their sum will also be divisible by k
          if(k%2==0){  remain[k/2] = Math.min(remain[k/2], 1);}
            int maximumSubset =0;
            //consider a case where we take number that is divisible by k into consideration,
            //there is only 1 number can be considered e.g. k=3 then we can either consider 3 or 9 both can not be considered together.
            maximumSubset = Math.min(remain[0], 1);

            //loop through the array of remainders array and get the max of remainder[i] or remainder[i-k]
        //The reason the loop only goes to k // 2 + 1 (I don't think it needs to do + 1 if you have a <= in the conditional) is because you're already comparing the two remainder counts in the first half of the loop. I.e. if k == 10, and you compare remainders 2 and 8 (k - 2), you don't need to then compare remainders 8 and 2 (k - 8), because that combination has already been counted via the max() function.
            for(int i=1;i<=k/2;i++){
                maximumSubset+=Math.max(remain[i], remain[k-i]);
            }

            return maximumSubset;

    }
    public static void main(String[]args){
        int []a = {4,2,2,3,4,6,3,0,6};
        nonDivisibleSubset(10,a);
    }

}
