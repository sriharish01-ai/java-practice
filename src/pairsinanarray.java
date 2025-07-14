import java.util.*;
public class pairsinanarray {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];


        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int m=sc.nextInt();
        System.out.print("value :"+m);
        for(int j=0;j<n-1;j++){
            for(int k=j;k<n-1;k++){
                if(arr[j]+arr[k]==m){
                    System.out.print("(" + arr[j] + "," + arr[k] + ")");

                }
            }
        }


    }
}
