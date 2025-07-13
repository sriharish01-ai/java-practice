import java.util.*;
public class reversent {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        String s=sc.nextLine();
        String result=" ";
        String word=" ";
        for(int i=0;i<=s.length();i++) {
            if (i < s.length() && s.charAt(i) != ' ') {
                word += s.charAt(i);


            } else {
                for (int j = word.length() - 1; j >= 0; j--) {
                    result += word.charAt(j);

                }
                result += "";
                word = " ";
            }
        }





        System.out.println(result.trim());

    }
}
