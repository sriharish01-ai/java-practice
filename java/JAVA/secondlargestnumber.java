import java.util.Scanner;
public class secondlargestnumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int largest = Integer.MIN_VALUE;
        int second = Integer.MAX_VALUE;
        for (int i = 0; i <n; i++) {
            arr[i] = sc.nextInt();

        }
        for (int i = 0; i < n; i++) {


            if (arr[i] > largest) {
                second = largest;
                largest=arr[i] ;
            } else if (arr[i] > second && arr[i] != largest) {
                second = arr[i];
            }
        }
        if(second==Integer.MIN_VALUE){
            System.out.print("no second");
        }
        else{
            System.out.print("second largest " + second);
        }
    }
}
