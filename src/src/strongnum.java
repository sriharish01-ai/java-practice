import java.util.*;
public class strongnum {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int n=num;
        int sum=0;

        while(num>0){
            int digit=num%10;
            int factor=1;

          for(int i=1;i<=digit;i++) {
              factor = factor * i;
          }
            sum+=factor;
            num=num/10;



        }
        if(n==sum){
            System.out.println("strong num");
        }
        else{
            System.out.println("not strong");
        }
    }
}
