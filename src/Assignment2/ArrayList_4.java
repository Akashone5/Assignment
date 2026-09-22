package Assignment2;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList_4 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<Integer> all=new ArrayList<>();
        for(int i=0;i<n;i++){
            all.add(sc.nextInt());
        }
        int k=sc.nextInt();
        for(int i=0;i<n;i++){
            if(all.contains(k)){
                System.out.print(i);
            }
            else System.out.print("Mark not found");
        }

    }
}
