package Assignment2;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList_7 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        ArrayList<Integer> all=new ArrayList<>();
        for(int i=0;i<n;i++){
            all.add(sc.nextInt());
        }
        all.remove(5);
        System.out.print(all);
    }
}
