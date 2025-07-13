import java.util.*;
public class movezerotoright {
    public static void movezerotoright(int[] arr) {
        int right = arr.length - 1;
        for (int i = arr.length - 1; i >=0; i--) {
            if (arr[i] != 0) {
                arr[right] = arr[i];
                right--;
            }}
            while (right >= 0) {

                arr[right] = 0;
                right--;
            }
        }





    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {

            arr[i] = sc.nextInt();
        }
        movezerotoright(arr);
        for (int num:arr) {
            System.out.print(num);
        }
    }}
