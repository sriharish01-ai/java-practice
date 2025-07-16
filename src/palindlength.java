import java.util.*;
public class palindlength{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        HashMap<Character,Integer> map=new HashMap<>();
        for(char ch:s.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        int length=0;
        boolean hashodd=false;
        for(int count:map.values()){
            if(count%2==0){
                length+=count;
            }
            else{
                length+=count-1;
                hashodd=true;
            }
        }
        if(hashodd){
            length+=1;

        }
        System.out.print("ma length "+ length);
    }
}
