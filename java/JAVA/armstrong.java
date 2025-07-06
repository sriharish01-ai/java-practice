import java.util.Scanner;
class armstttrong{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int original=num;
        int sum=0;
        while(num>0){
            int digit=num%10;
            sum=sum+(digit*digit*digit);
            num=num/10;

        }
    if(original==sum){
        System.out.println("this is armstrong num"+ " " +sum);
    }
    else{
        System.out.println("this is not a armstrong num" + sum);
    }

    }
}