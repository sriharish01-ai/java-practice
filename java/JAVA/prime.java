import java.util.*;
public class prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean isprime = true;
        if (n <= 1) {
            isprime = false;
        } else {
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    isprime = false;
                    break;
                }
            }
        }
        if (isprime) {
            System.out.print("prime " + n);
        } else {
            System.out.print("not prime " + n);
        }
    }

}


