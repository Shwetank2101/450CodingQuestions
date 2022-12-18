public class fav {
    public static void main(String[] args) {
        fib(3, 6, 6);
    }

    static void fib(int s, int s1, int n) {
        int f[] = new int[n + 2];
        int i;

        f[0] = s;
        f[1] = s1;

        for (i = 2; i <= n; i++) {
            f[i] = f[i - 1] + f[i - 2];
        }

        for (int j = 0; j < n; j++) {
            System.out.println(f[j]);
        }
    }
}
