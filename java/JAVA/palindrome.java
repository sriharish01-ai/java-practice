import java.util.Scanner;
class palindrome{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter a number");
        int num=sc.nextInt();
        int original=num;
        int reverse=0;
        while(num>0){
            int digit=num%10;
            reverse=(reverse*10)+digit;
            num=num/10;
        }
    if(original==reverse){
        System.out.println("palindrome");
    }
    else{
        System.out.println("not a palindrome");
    }

    }
}