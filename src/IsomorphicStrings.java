import java.util.HashMap;
import java.util.Map;

public class IsomorphicStrings {
    public static boolean similarstrings(String s1,String t1){
        if(s1 == null || t1 == null) return false;
        if(s1.length() != t1.length()) return false;
        Map<Character,Character> freq1 = new HashMap<>();
        Map<Character,Character> freq2 = new HashMap<>();
        for(int i=0;i<s1.length();i++){
            char cs = s1.charAt(i);
            char ct = t1.charAt(i);

            if(freq1.containsKey(cs)){
                if(freq1.get(cs) != ct) return false;
            }
            else{
                if(freq2.containsKey(ct)) return false;
                freq1.put(cs,ct);
                freq2.put(ct,cs);
            }
        }
        return true;
    }

    public static void main(String[] args){
        String s = "egg";
        String t = "add";
        Boolean result = similarstrings(s,t);
        System.out.println(result);
    }
}
