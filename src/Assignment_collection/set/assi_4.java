package Assignment_collection.set;

import java.util.HashSet;
import java.util.*;

public class assi_4 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        HashSet<String> set=new HashSet<>();
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            set.add(sc.next());
        }
        String k=sc.next();
        for(int i=0;i<n;i++){
            if(set.contains(k)){
                System.out.print("Present sir");
            }
            else System.out.print("Absent sir");
        }
    }
}
