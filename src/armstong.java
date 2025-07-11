import java.util.*;
public class armstong {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int original=x;
        int result=0;
        int digits=String.valueOf(x).length();
        while(x>0){
            int digit = x%10;
            result+=Math.pow(digit,digits);
            x=x/10;

        }
        if(result==original){
            System.out.println("armastomg");
        }
        else{
            System.out.println("not a armstrong");
        }

    }
}
