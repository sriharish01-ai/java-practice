import java.util.*;
public class sortbycharfreq{
    public static String sortbycharfreq(String s){
        HashMap<Character,Integer> map=new HashMap<>();
        for(char ch:s.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);

        }
        PriorityQueue<Character> maxhead=new PriorityQueue<>((a,b)->map.get(b)-map.get(a));
        maxhead.addAll(map.keySet());
        StringBuilder result=new StringBuilder();
        while(!maxhead.isEmpty()){
            char current = maxhead.poll();
            int frq=map.get(current);
            for(int i=0;i<frq;i++){
                result.append(current);
            }

        }
        return result.toString();
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        System.out.print(sortbycharfreq(s));

    }
}
