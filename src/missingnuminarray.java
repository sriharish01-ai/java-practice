import java.util.*;
public class missingnuminarray {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int num=sc.nextInt();
        int expected = num*(num+1)/2;
        int actual=0;
        for(int i=0;i<arr.length;i++){
            actual+=arr[i];
        }
        int missing=expected-actual;
        System.out.print("missing num" + missing);
    }
}
