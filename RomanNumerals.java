import java.util.LinkedHashMap;
import java.util.Map;

public class RomanNumerals {

    // Symbol -> Value  (for Roman -> Integer)
    private static final Map<String, Integer> symbolToValue = new LinkedHashMap<>();
    // Value -> Symbol  (for Integer -> Roman)
    private static final Map<Integer, String> valueToSymbol = new LinkedHashMap<>();

    static {
        symbolToValue.put("M", 1000);
        symbolToValue.put("CM", 900);
        symbolToValue.put("D", 500);
        symbolToValue.put("CD", 400);
        symbolToValue.put("C", 100);
        symbolToValue.put("XC", 90);
        symbolToValue.put("L", 50);
        symbolToValue.put("XL", 40);
        symbolToValue.put("X", 10);
        symbolToValue.put("IX", 9);
        symbolToValue.put("V", 5);
        symbolToValue.put("IV", 4);
        symbolToValue.put("I", 1);

        for (Map.Entry<String, Integer> e : symbolToValue.entrySet()) {
            valueToSymbol.put(e.getValue(), e.getKey());
        }
    }

    public static String toRoman(int n) {
        StringBuilder roman = new StringBuilder();
        for (Map.Entry<Integer, String> e : valueToSymbol.entrySet()) {
            int value = e.getKey();
            while (n >= value) {
                roman.append(e.getValue());
                n -= value;
            }
        }
        return roman.toString();
    }

    public static int fromRoman(String romanNumeral) {
        int total = 0;
        int i = 0;
        while (i < romanNumeral.length()) {
            // try the two-character symbols first (CM, CD, XC, XL, IX, IV)
            if (i + 1 < romanNumeral.length()) {
                String pair = romanNumeral.substring(i, i + 2);
                Integer value = symbolToValue.get(pair);
                if (value != null) {
                    total += value;
                    i += 2;
                    continue;
                }
            }
            total += symbolToValue.get(romanNumeral.substring(i, i + 1));
            i++;
        }
        return total;
    }
}