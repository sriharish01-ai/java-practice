import java.util.*;
public class checksort {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        boolean issorted=true;
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n-1;i++){
            if(arr[i]>arr[i+1]){
                issorted=false;
                break;
            }

        }
        if(issorted){
            System.out.println("arrray is sorted");
        }
        else{
            System.out.println("array is not sorted");
        }
    }
}
