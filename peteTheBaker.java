import java.util.Map;

public class PeteBaker {
  public static int cakes(Map<String, Integer> recipe, Map<String, Integer> available) {
    int maxCakes = Integer.MAX_VALUE;
    
    for (Map.Entry<String, Integer> entry : recipe.entrySet()) {
      String ingredient = entry.getKey();
      int needed = entry.getValue();
      int have = available.getOrDefault(ingredient, 0);
      
      int possible = have / needed;
      
      if (possible < maxCakes) {
        maxCakes = possible;
      }
    }
    
    return recipe.isEmpty() ? 0 : maxCakes;
  }
}