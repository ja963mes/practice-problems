public class RgbToHex {
    public static String rgb(int r, int g, int b) {
        int[] input = {r, g, b};
        StringBuilder solution = new StringBuilder();

        for (int i = 0; i < input.length; i++) {
            // clamp to valid range
            if (input[i] < 0) input[i] = 0;
            if (input[i] > 255) input[i] = 255;

            // convert to 2-digit hex
            String hex = Integer.toHexString(input[i]).toUpperCase();
            if (hex.length() == 1) hex = "0" + hex;

            solution.append(hex);
        }

        return solution.toString();
    }
}