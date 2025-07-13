import java.util.*;
public class anagram {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String a= sc.nextLine().toLowerCase().replaceAll("//s","");
        String b= sc.nextLine().toLowerCase().replaceAll("//s","");
        if(isanagram(a,b)){
            System.out.println("it is anagaram");
        }
        else{
            System.out.println("not a anagaram");
        }



    }

    static boolean isanagram(String s1,String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        HashMap<Character, Integer> map = new HashMap<>();
        for (char ch : s1.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);

        }
        for (char ch : s2.toCharArray()) {
            if (!map.containsKey(ch)) {
                return false;
            }
            map.put(ch, map.get(ch) - 1);
            if (map.get(ch) < 0) {
                return false;
            }
        }
        return true;
    }

    }











