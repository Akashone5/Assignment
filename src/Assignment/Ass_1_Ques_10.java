package Assignment;
import java.util.*;
public class Ass_1_Ques_10 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nums[] = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
    int officer=0;
    int unique=1;
    int cm=1;
       while(nums.length>cm){
        if(nums[cm]==nums[cm-1]){
            cm++;
            continue;
        }
        else {
            nums[officer+1]=nums[cm];
            officer++;
            unique++;
            cm++;
        }

    }
   System.out.print(unique);}
}
