class Kata {
    static String alphabetPosition(String text) {
      String[] alphabet = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
      String dummy = text.toLowerCase();
      String answer = "";
      for(int i=0; i< dummy.length(); i++){
        String letter = String.valueOf(dummy.charAt(i));
        int position = Arrays.asList(alphabet).indexOf(letter);
        if(position == -1){
            continue;
        }
        answer += String.valueOf(position+1)+" ";

      } 
      return answer.trim();
    }
}