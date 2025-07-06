import java.util.*;
public class reversee {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        String a=sc.nextLine();
         String reversed=" " ;
        for(int i=a.length()-1;i>=0;i--){
            reversed+=a.charAt(i);

        }
        System.out.print("output " + reversed);
    }
}
