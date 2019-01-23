package HRank;

public class StariCase {
    public static void main (String[]args){

        int n =5;
        int m =n;
        int count =0;
        int stair =0;
        while(true){
            if(count>=n){
                break;
            }
            for(int i=0;i<m-1;i++){
                System.out.print(" ");
            }
            int x=m;
            while(x<=n) {
                System.out.print("*");
                x++;
            }
            System.out.println("");
            m=m-1;
            count++;

        }
    }
}
