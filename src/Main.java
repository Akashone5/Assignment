import java.util.*;
    class Solution {
        public static void main(String args[]){
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            int nums[]=new int[n];
            for(int i=0;i<n;i++){
                nums[i]=sc.nextInt();
            }
            int sum=0;
            int sum1=0;
            boolean boo=false;
            for(int i=0;i<nums.length;i++){
                sum=sum+nums[i];
            }
            for(int i=0;i<nums.length;i++){
                sum1=sum1+nums[i];
                if(sum-sum1==0){
                    boo=true;
                }
                else boo=false;
            }
            System.out.print(boo);;
        }
    }