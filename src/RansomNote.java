import java.util.HashMap;
import java.util.Map;

public class RansomNote {
    public static boolean CanConstruct(String rn, String m){
        if(rn == null || m == null) return false;
        if(rn.length() > m.length()) return false;

        Map<Character,Integer> freq = new HashMap<>();
        for(char c : m.toCharArray()){
            freq.put(c,freq.getOrDefault(c,0)+1);
        }

        for(char c: rn.toCharArray()){
            int count = freq.getOrDefault(c,0);
            if(count == 0) return false;
            freq.put(c,count-1);
        }
        return true;
    }
    public static void main(String[] args){
        String ransomNote = "a";
        String magazine = "ab";
        Boolean result = CanConstruct(ransomNote,magazine);
        System.out.println(result);
    }
}
