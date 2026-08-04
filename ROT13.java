import java.util.Arrays;

class Solution {
   public static String rot13(String message) {
    Character[] lowerCase = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
    Character[] upperCase = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
    String solution = "";
    for(int i=0; i<message.length();i++){
        if(Character.isLetter(message.charAt(i))){
            if(Character.isLowerCase(message.charAt(i))){
                int index = Arrays.asList(lowerCase).indexOf(message.charAt(i));
                if(index == -1){
                    solution += message.charAt(i);
                }else{
                    index = (index + 13) % 26;
                    solution += lowerCase[index];
                }
            }else{
                int index = Arrays.asList(upperCase).indexOf(message.charAt(i));
                if(index == -1){
                    solution += message.charAt(i);
                }else{
                    index = (index + 13) % 26;
                    solution += upperCase[index];
                }
            }
        }else{
            solution += message.charAt(i);
        }
    }
    
    return solution;
   }
}