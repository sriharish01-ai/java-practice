import java.util.*;
public class sumofdigrecursion {
    public static int sumofdigit(int n){
        if(n==0){
            return 0;
        }
        return (n%10) + (sumofdigit(n/10));
    }





    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int ans=sumofdigit(num);
        System.out.println(ans);



    }
}
