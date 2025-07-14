import java.util.*;
public class longestsubstringnonrep{
    public static int longestsubstringnonrep(String p){
        int left=0;
        int maxlength=0;
        HashSet<Character> set=new HashSet<>();

        for(int right=0;right<p.length();right++){
            char ch=p.charAt(right);
            while(set.contains(ch)){
                set.remove(p.charAt(left));
                left++;
            }
            set.add(ch);
            int windowlength=right-left+1;
            maxlength=Math.max(maxlength,windowlength);

        }
        return maxlength;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        System.out.print("longest substring:" + longestsubstringnonrep(s));
    }
}