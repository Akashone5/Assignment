package Assignment_collection.ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList_3 { public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    ArrayList<Integer> all=new ArrayList<>();
    for(int i=0;i<n;i++){
        all.add(sc.nextInt());
    }
    for(int i=0;i<n;i=i+2){
            System.out.println(all.get(i));
    }

}
}
