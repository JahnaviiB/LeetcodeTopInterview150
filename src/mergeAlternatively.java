public class mergeAlternatively {
    public static String mergeAlternatively(String w1,String w2){
        StringBuilder merged = new StringBuilder();
        int maxLength = Math.max(w1.length(),w2.length());
        for(int i=0;i<maxLength;i++){
            if(i<w1.length()){
                merged.append(w1.charAt(i));
            }
           if(i<w2.length()){
               merged.append(w2.charAt(i));
           }
        }
        return merged.toString();
    }
    public static void main(String[] args){
        String s1 = "Jha";
        String s2 = "anvi";
        String result = mergeAlternatively(s1,s2);
        System.out.println("Merged strings is " + result);
    }
}
