import java.util.Scanner;
public class prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        if(x<=1){
            System.out.print("invalid");
            return;
        }
        boolean isprime = true;
        for(int i=2;i<=x/2;i++){
            if(x%i==0){
                isprime=false;
                break;
            }
         }
        if(isprime){
            System.out.println("is a prime");
        }
        else{
            System.out.println("not");
        }

}
}