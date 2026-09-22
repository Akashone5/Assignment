package Assignment_collection.set;
import java.util.*;
public class ass_1 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        HashSet<String> set=new HashSet<>();
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            set.add(sc.next());
        }
        System.out.print(set);
    }
}
