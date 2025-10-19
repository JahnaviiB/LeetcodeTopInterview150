import java.util.HashMap;
import java.util.Map;

public class ValidAnagram {
    public static boolean anagram(String s1,String t1){
        if(s1 == null || t1 == null) return false;
        if(s1.length() != t1.length()) return false;

        Map<Character,Integer> f1 = new HashMap<>();
        for(char c:s1.toCharArray()){
            f1.put(c,f1.getOrDefault(c,0)+1);
        }
        for(char c:t1.toCharArray()){
            if(!f1.containsKey(c)) return false;
            f1.put(c,f1.getOrDefault(c,0)-1);
            if(f1.get(c) < 0) return false;
        }
        return true;
    }
    public static void main(String[] args){
        String s = "anagram";
        String t = "nagram";
        Boolean result = anagram(s,t);
        System.out.println(result);
    }
}
