import java.util.Scanner;
public class factorial {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int factorial=1;
        if(x<1){
            System.out.println("1");
            return;
        }
        for(int i=1;i<=x;i++){
            factorial=factorial*i;
        }
        System.out.println(factorial);
    }
}
