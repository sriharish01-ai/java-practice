import java.util.*;
public class palindrome {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String str=String.valueOf(n);
        int start=0;
        int end=str.length()-1;
        boolean ispalindrome=true;
        while(start<end){
            if(str.charAt(start)!=str.charAt(end)){
                ispalindrome=false;
                break;

            }
            start++;
            end--;

        }
        if(ispalindrome){
            System.out.println("palindrome");
        }
        else{
            System.out.println("not");
        }

    }
}
