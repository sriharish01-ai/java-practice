import java.util.*;
public class roatearrayby1right {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int x=arr.length;
        int temp=arr[x-1];
        for(int i=x-1;i>0;i--){
            arr[i]=arr[i-1];

        }
        arr[0]=temp;
        for(int num:arr){
            System.out.println(num + " ");
        }
    }
}
