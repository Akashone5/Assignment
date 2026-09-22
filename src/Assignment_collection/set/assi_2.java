package Assignment_collection.set;

import java.util.HashSet;
import java.util.*;

public class assi_2 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        LinkedHashSet<String> set=new LinkedHashSet<>();
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            set.add(sc.next());
        }
        System.out.print(set);
    }
}
