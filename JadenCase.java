public class JadenCase {

    public String toJadenCase(String phrase) {
        if (phrase == null || phrase == "") {
            return null;
        }

        String[] dummy = phrase.split(" ");

        for (int i = 0; i < dummy.length; i++) {
            if (!dummy[i].isEmpty()) {
                dummy[i] = dummy[i].substring(0, 1).toUpperCase() + dummy[i].substring(1);
            }
        }

        String result = String.join(" ", dummy);
        return result;
    }

}