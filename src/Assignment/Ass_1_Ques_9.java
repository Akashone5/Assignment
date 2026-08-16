package Assignment;

import java.util.*;

public class Ass_1_Ques_9 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nums[] = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
    int pro=1;
    int pro2=1;

        Arrays.sort(nums);
    pro=pro*nums[n-1]*nums[n-2]*nums[n-3];
    pro2=pro2*nums[0]*nums[1]*nums[n-1];
        System.out.print(Math.max(pro,pro2));
}
}