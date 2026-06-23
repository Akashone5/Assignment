import java.util.*;

public class A282 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int x=0;
        int count=0;
        String arr[]=new String[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.next();
        }
        for(int i=0;i<n;i++){
           String ch=arr[i];
           if(ch.contains("+")){
            x++;
           }
           else if(ch.contains("-")){
               x--;
           }
        }
        System.out.println(x);
}}
