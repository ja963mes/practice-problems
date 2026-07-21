import java.util.Arrays;
public class Kata {
    public static int[] twoOldestAges(int[] ages) {
      Arrays.sort(ages);
      int[] answer = {ages[ages.length-2], ages[ages.length-1]};
        return answer; // your code here
    }
}