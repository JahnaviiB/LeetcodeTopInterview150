public class mergeAlternatively {
    public static String mergeAlternatively(String w1,String w2){
        StringBuilder merged = new StringBuilder();
        int max_lenght = Math.max(w1.length(),w2.length());

    }
    public static void main(String[] args){
        String s1 = "Jh";
        String s2 = "an";
        String result = mergeAlternatively(s1,s2);
        System.out.println("Merged strings is " + result);
    }
}
