import java.util.*;
public class fstrepnum {
    public static int fstrepnum(int[] arr){
        HashSet<Integer> set=new HashSet<>();
        for(int num:arr){
            if(set.contains(num)){
                return num;
            }
            else{
                set.add(num);
            }

        }
        return -1;

    }




    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("rep num" + fstrepnum(arr));

    }

}
