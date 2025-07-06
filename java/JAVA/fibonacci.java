import java.util.Scanner;
class fibonacci{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("how many numbers do you want?");
        int num=sc.nextInt();
        int first=0,second=1;
        for(int i=1;i<=num;i++){
            System.out.println(first+ " ");
            int next=first+second;
            first=second;
            second=next;

        }


        
    }
}