public class PlusOneArray {
    public static int[] upArray(final int[] arr) {
        int arrLen = arr.length;
        String out = String.join(",", arr);
        int outInt = Integer.parseInt(out);
        outInt = outInt + 1;
        out = Integer.toString(outInt);
        int[] outArr = new int[out.length()];
        for(int i = 0; i < out.length(); i++) {
            outArr[i] = Character.getNumericValue(out.charAt(i));
        }
        return outArr;
    }
}