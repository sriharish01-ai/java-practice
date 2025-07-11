import java.util.*;
public class harshad {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int n=num;
        int sum=0;
        while(num>0){
            int digit=num%10;
            sum+=digit;
            num=num/10;



        }
        if(n%sum==0){
            System.out.println("Harsad");
        }
        else{
            System.out.println("not a Harshad");
        }

    }
}
