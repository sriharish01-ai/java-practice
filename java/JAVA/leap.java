import java.util.Scanner;
class leap{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int year=sc.nextInt();
        if((year%4==0 && year/100!=0)||(year%400==0)){
            System.out.println("it is leap year"+ year);
        }
        else{
            System.out.println("not a leap year" + year);
        }
    }
}