public class PigLatin {
    public static String pigIt(String str) {
        String[] stringArray = str.split(" ");
        for(int i=0; i < stringArray.length; i++){
            char dummy = stringArray[i].charAt(0);
            if(Character.isLetter(dummy)){
                String substring = stringArray[i].substring(1, stringArray[i].length());
                stringArray[i] = substring + dummy + "ay";
            }
            else{
              continue;
            }

        }
        String sentence = String.join(" ", stringArray);
        return sentence;
    }
}