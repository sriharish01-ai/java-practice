import java.util.*;
public class sumofdigit {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int add=0;
        while(num!=0){
            int digit=num%10;
            add=add+digit;
            num=num/10;

        }
        System.out.println(add);
    }
}
