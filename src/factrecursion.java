import java.util.*;
public class factrecursion {
    public static int factorial(int n){
        if(n==0 || n==1){
            return 1;
        }
        return n*factorial(n-1);
    }



    public static void main(String[] args){
        Scanner sc=new Scanner (System.in);
        int num =sc.nextInt();
        int fact=factorial(num);
        System.out.println(fact);
    }
}
