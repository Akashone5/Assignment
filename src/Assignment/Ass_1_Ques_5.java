package Assignment;
import java.util.*;
public class Ass_1_Ques_5 {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int fruits[]=new int[n];
        for(int i=0;i<n;i++){
            fruits[i]=sc.nextInt();
        }
        int m=sc.nextInt();

        int baskets[]=new int[n];
        for(int i=0;i<n;i++){
            baskets[i]=sc.nextInt();
        }

    // boolean full[]=new boolean[n];
    int box=n;
       for(int i=0;i<fruits.length;i++){
        for(int j=0;j<baskets.length;j++){
            if(baskets[j]>=fruits[i]){
                baskets[j]=-1;
                box--;
                break;
            }
        }
    }
      System.out.print(box);
}}
