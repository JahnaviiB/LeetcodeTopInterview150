import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicate {
    public static boolean duplicatenums(int[] n,int target){
        Map<Integer,Integer> freq = new HashMap<>();
        for(int i=0;i<n.length;i++){
            int number = n[i];

            if(freq.containsKey(number)){
                if(i - freq.get(number) <= target){
                    return true;
                }
            }
            freq.put(number,i);
        }
        return false;
    }
    public static void main(String[] args){
        int[] nums = {1,2,3,1};
        int k = 3;
        Boolean result = duplicatenums(nums,k);
        System.out.println(result);
    }
}
