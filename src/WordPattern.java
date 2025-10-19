import java.util.HashMap;
import java.util.Map;

public class WordPattern {
    public static boolean samepattern(String p,String s1){
        if(p == null || s1 == null) return false;

        String[] words = s1.trim().split("\\s+");
        if(p.length() != words.length) return false;

        Map<Character,String> f1 = new HashMap<>();
        Map<String,Character> f2 = new HashMap<>();
        for(int i=0;i<p.length();i++){
            char c = p.charAt(i);
            String w = words[i];

            if(f1.containsKey(c)){
                if(!f1.get(c).equals(w)) return false;
            }
            else{
                if(f2.containsKey(w)) return false;
            }
            f1.put(c,w);
            f2.put(w,c);
        }
        return true;
    }
    public static void main(String[] args){
        String pattern = "abba";
        String s = "dog cat cat dog";
        Boolean result = samepattern(pattern,s);
        System.out.println(result);
    }
}
