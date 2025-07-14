import java.util.*;
public class checkrotateequaltogiven {
    public static void main(String[] args){
        Scanner sc= new Scanner (System.in);
        String a=sc.nextLine();
        String b=sc.nextLine();

        if(a.length()!=b.length()){
            System.out.print("no equal length");
        }
        else {
            String  temp = a + a;
            if (temp.contains(b)) {
                System.out.print("matched");
            } else {
                System.out.print("not matched");
            }
        }


    }
}

