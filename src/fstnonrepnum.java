import java.util.*;
public class fstnonrepnum {
    public static int fstnonrepnum(int[] arr){
        LinkedHashMap<Integer,Integer> map=new LinkedHashMap<>();
        for(int num:arr){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            if(entry.getValue()==1){
                return entry.getKey();

            }
        }
        return -1;
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("non rep char "+ fstnonrepnum(arr));
    }
}

