import java.util.Arrays;
import java.util.List;

public class Troll {
    public static String disemvowel(String str) {
        Character[] vowels = {'a','e','i','o','u','A','E','I','O','U'};
        String solution = "";
        for(int i=0; i<str.length(); i++){
          if(Arrays.asList(vowels).contains(str.charAt(i))){
            continue;
          }else{
            solution += str.charAt(i);
          }
        }
      return solution;
    }
}