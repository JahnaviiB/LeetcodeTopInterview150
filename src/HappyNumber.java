import java.util.HashSet;
import java.util.Set;

public class HappyNumber {
        public static boolean yeshappy(int number){
            Set<Integer> seen = new HashSet<>();
            while(number != 1 && !seen.contains(number)){
                seen.add(number);
                number = getsquaresofnum(number);
            }
            return number == 1;

        }
        private static int getsquaresofnum(int n) {
            int sum = 0;
            while (n > 0) {
                int digit = n % 10;
                sum += digit * digit;
                n /= 10;
            }
            return sum;
        }
        public static void main(String[] args){
            int num = 19;
            Boolean result = HappyNumber.yeshappy(num);
            System.out.println(result);
        }
    }
