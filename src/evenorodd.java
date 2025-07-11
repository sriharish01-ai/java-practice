import java.util.Scanner;
public class evenorodd {
    public static void main(String[] arggs) {

        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        if(x%2==0){
            System.out.println("even");
        }
        else{
            System.out.println("odd");
        }

    }
}