import java.util.*;
public class perfect {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int sum=0;
        for(int i=1;i<=num/2;i++){
            if(num%i==0){
                sum=sum+i;

            }

        }
        if(num==sum){
            System.out.println("perfect");
        }
        else{
            System.out.println("not a perfect");
        }
    }
}
