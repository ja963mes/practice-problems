import java.util.*;
import java.util.stream.*;

public class Kata {
  public static int[] arrayDiff(int[] a, int[] b) {
    Set<Integer> exclude = Arrays.stream(b).boxed().collect(Collectors.toSet());
    return Arrays.stream(a).filter(x -> !exclude.contains(x)).toArray();
  }
}