import java.util.*;
public class movezerostoleft {
    public static void movezerostoleft(int[] arr){
        int left=0;
        for(int i=0;i<arr.length-1;i++) {
            if (arr[i] != 0) {
                arr[left] = arr[i];
                left++;
            }

            while (left >=0) {
                arr[left] = 0;
                left--;
            }
        }
    }




    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        movezerostoleft(arr);
        for(int num:arr){
            System.out.print(num+" ");
        }
    }
}
