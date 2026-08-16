package Assignment;
import java.util.Scanner;
public class Ass_1_Ques_2 {
    public static void main(String args[]){
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            int arr[]=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();

            }
            int two=arr[0];
            int lar=arr[0];

            for(int i=0;i<n;i++){
                if(arr[i]>lar){
                    two=lar;
                    lar=arr[i];
                }
                if(arr[i]>two&&arr[i]!=lar){
                    two =arr[i];}

            }
            System.out.print(two);
        }
    }


