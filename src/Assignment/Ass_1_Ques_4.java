package Assignment;
import java.util.*;
public class Ass_1_Ques_4 {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int nums[]=new int[n];
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        int target=sc.nextInt();
    int x=nums.length;

    for(int i=0;i<x;i++){
        if(nums[i]==target){

          System.out.print(i);


        }
    }
        System.out.print(-1);
    }
}
