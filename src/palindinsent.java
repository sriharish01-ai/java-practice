import java.util.*;
public class palindinsent {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine().toLowerCase().replaceAll("\\s","");

        int start=0;
        int end=s.length()-1;
        boolean isplaindrome=true;
        while(start<end){
            if(s.charAt(start)!=s.charAt(end)){
                isplaindrome=false;
                break;
            }
            start++;
            end--;


        }

        if (isplaindrome){
            System.out.print("palindrome");
        }
        else{
            System.out.print("not a palindrome");
        }



    }
}
