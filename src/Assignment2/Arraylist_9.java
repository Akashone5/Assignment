package Assignment2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Arraylist_9 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        ArrayList<Integer> all=new ArrayList<>();
        for(int i=0;i<n;i++){
            all.add(sc.nextInt());
        }Collections.sort(all);
       System.out.print( Collections.min(all));
        System.out.print( Collections.max(all));

    }
}
