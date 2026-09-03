import java.util.*;

class RevRot {
    
    public static String revRot(String strng, int sz) {
      
      if(sz == 0){
        return "";
      }
      
      int iterations = strng.length() / sz;
      List<String> holderArr = new ArrayList<>();
      int startPosition = 0;
      int endPosition = sz;
      

      
      for(int i=0; i < iterations; i++){
        holderArr.add(strng.substring(startPosition, endPosition));
          startPosition += sz;
          endPosition += sz;
      }
      for(int i=0; i<holderArr.size(); i++){
        int sum = 0;
        String element = holderArr.get(i);
        for(int j=0; j<element.length(); j++){
          sum += (int)element.charAt(j);
        }
        if(sum % 2 == 0){
          element = new StringBuilder(element).reverse().toString();
        }else{
          element = element.substring(1) + element.charAt(0);
        }
        holderArr.set(i, element);
      }
      
      String out = String.join("",holderArr);
      return out;
    } 
}