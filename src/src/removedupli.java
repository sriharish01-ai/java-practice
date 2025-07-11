import java.util.*;
public class removedupli {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr= new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();

        }
        HashSet<Integer> set= new HashSet<>();
        for(int num:arr){
            set.add(num);
        }
        System.out.println(set);

    }
}
