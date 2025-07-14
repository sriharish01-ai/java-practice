import java.util.*;
public class rotatebynwayleft {
   public static void rotatebynwayleft(int arr[] , int d){
       int n=arr.length;
       d=d%n;
       int[] temp=new int[d];
       for(int i=0;i<d;i++){
           temp[i]=arr[i];
       }
       for(int i=d;i<n;i++){
           arr[i-d]=arr[i];
       }
       for(int i=0;i<d;i++){
           arr[n-d+i]=temp[i];
       }

   }










    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();

        }

    System.out.print("enter how many times to roate");
        int d=sc.nextInt();
        rotatebynwayleft(arr,d);
        for(int num:arr){
            System.out.print(num);
        }


    }
}
