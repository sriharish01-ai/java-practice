import java.util.*;
public class groupanagrams{
    public static List<List<String>> groupanagram(String[] str){
        HashMap<String,ArrayList<String>> map=new HashMap<>();
        for(String word:str){
            char[] ch=word.toCharArray();
            Arrays.sort(ch);
            String sortedword=new String(ch);
            if(!map.containsKey(sortedword)){
                map.put(sortedword,new ArrayList<String>());
            }
            map.get(sortedword).add(word);

        }
        return new ArrayList<>(map.values());




    }
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        String[] s=new String[n];
        for(int i=0;i<n;i++){
            s[i]=sc.nextLine();

        }
        List<List<String>> result=groupanagram(s);
        for(List<String> x:result){
            System.out.print(x);
        }
    }

}

