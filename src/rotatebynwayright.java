import java.util.*;
public class rotatebynwayright {
    public static void roatearrayby1right(int[] arr,int d){
        int n=arr.length;
        d=d%n;
        int[] temp= new int[n];
        for(int i=0;i<d;i++){
            temp[i]=arr[n-d+i];
        }

        for(int i=d;i<n;i++){
            temp[i]=arr[i-d];
        }
        for(int i=0;i<n;i++){
            arr[i]=temp[i];
        }


    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();

        }
        System.out.print("how many times to rotate  ");
        int d=sc.nextInt();
        roatearrayby1right(arr,d);
        for(int num:arr){
            System.out.print(num);
        }


    }
}
