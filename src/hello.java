import java.util.*;
public class hello {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String[] words= new String[n];
      for(int i=0;i<n;i++) {
          words[i] = sc.next();
      }
      for(int i=0;i<n;i++){
          String s=words[i];
        int l=s.length();
        if(l>10){
            System.out.println("" + s.charAt(0)+ (l-2) + s.charAt(l-1));
        }
        else System.out.println(s);
      }


    }
}
