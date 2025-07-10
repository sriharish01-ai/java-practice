import java.util.Scanner;
public class fibonacci {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int a=0;
        int b=1;
        int count=0;
        while(count<x){
            System.out.println(a+" ");
            int next=a+b;
            a=b;
            b=next;
            count++;
        }
    }
}
