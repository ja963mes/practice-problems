public class CountIPAddresses {

    public static long convertToInt(String[] str) {
        int n = 3;
        long dummy = 0;
        for (int i = 0; i < str.length; i++) {
            dummy += Integer.parseInt(str[i]) * (long) Math.pow(256, n);
            n--;
        }
        return dummy;
    }

    public static long ipsBetween(String start, String end) {
        String[] beginningIPs = start.split("\\.");
        String[] finalIPs = end.split("\\.");

        long firstNum = convertToInt(finalIPs);
        long secondNum = convertToInt(beginningIPs);

        long result = firstNum - secondNum;
        return result;
    }
}