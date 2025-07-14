import java.util.*;
public class fstrepchar {
    public static char fstrepchar(String p){
        HashSet<Character> map=new HashSet<>();
        for(char c:p.toCharArray()){
            if(map.contains(c)){
                return c;
            }
            else{
                map.add(c);
            }
        }
        return '-';
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        System.out.print("rep char" + fstrepchar(s));

    }




}

