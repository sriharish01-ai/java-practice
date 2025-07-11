import java.util.*;
public class seclargest {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();

        }
        int largest=Integer.MIN_VALUE;
        int seclarge=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i]>largest){
                seclarge=largest;
                largest=arr[i];
            }
            else if(arr[i]>seclarge && arr[i]!=largest){
                seclarge=arr[i];
            }

        }
        if(seclarge==Integer.MIN_VALUE){
            System.out.println("no second");
        }
        else{
            System.out.println("Second largest is"+ seclarge);
        }

    }
}
