class Fibkind {

    private static long[] buildU(int n) {
        long[] u = new long[n + 1]; // u[0] unused
        u[1] = 1;
        if (n >= 2) {
            u[2] = 1;
        }
        for (int i = 3; i <= n; i++) {
            u[i] = u[(int)(i - u[i - 1])] + u[(int)(i - u[i - 2])];
        }
        return u;
    }

    public static long lengthSupUK(int n, int k) {
        long[] u = buildU(n);
        long count = 0;
        for (int i = 1; i <= n; i++) {
            if (u[i] >= k) {
                count++;
            }
        }
        return count;
    }

    public static long comp(int n) {
        long[] u = buildU(n);
        long count = 0;
        for (int i = 2; i <= n; i++) {
            if (u[i] < u[i - 1]) {
                count++;
            }
        }
        return count;
    }
}