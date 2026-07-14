import java.util.*;
import java.util.stream.*;

public class Kata {
  public static int[] arrayDiff(int[] a, int[] b) {
    if (a == null) return b;
    if (b == null) return a;

    Set<Integer> bSet = Arrays.stream(b).boxed().collect(Collectors.toSet());

    List<Integer> result = new ArrayList<>();
    for (int i = 0; i < a.length; i++) {
      if (!bSet.contains(a[i])) {
        result.add(a[i]);
      }
    }

    return result.stream().mapToInt(Integer::intValue).toArray();
  }
}
