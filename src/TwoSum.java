import jdk.dynalink.linker.support.CompositeGuardingDynamicLinker;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static int[] targetsum(int[] n, int t) {
        Map<Integer, Integer> freq = new HashMap<>();
        int complement;
        int i;
        for (i = 0; i < n.length; i++) {
            complement = t - n[i];
        if (freq.containsKey(complement)) {
            return new int[]{freq.get(complement), i};
        }
        freq.put(n[i], i);
    }
    return new int[]{};
}
    public static void main(String[] args){
        int[] nums = {2,8,11,7,15};
        int target = 9;
        int[] result = TwoSum.targetsum(nums,target);
        System.out.println("[" + result[0] + "," + result[1] + "]");
    }
}