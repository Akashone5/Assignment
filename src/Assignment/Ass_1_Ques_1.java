package Assignment;
import java.util.*;
public class Ass_1_Ques_1 {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int nums[]=new int[n];
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        int m = Integer.MIN_VALUE, f = m;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= f) {
                m = f;
                f = nums[i];
            } else if (nums[i] > m) {
                m = nums[i];
            }
        }
       System.out.print((f - 1) * (m - 1));
    }
}