public class PlusOneArray {
    public static int[] upArray(final int[] arr) {
        if (arr == null || arr.length == 0) return null;
        for (int d : arr) if (d < 0 || d > 9) return null;

        int[] res = arr.clone();
        for (int i = res.length - 1; i >= 0; i--) {
            if (res[i] < 9) { res[i]++; return res; }
            res[i] = 0;
        }

        int[] expanded = new int[res.length + 1];
        expanded[0] = 1;
        return expanded;
    }
}