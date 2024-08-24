public class Task3 {
    public static void main(String[] args) {
        int a, b, c, d, e, f, j, res, k;
        for (int i = 10; i <= 1000000; i++) {
            a = i / 100000;
            b = i % 100000 / 10000;
            c = i % 10000 / 1000;
            d = i % 1000 / 100;
            e = i % 100 / 10;
            f = i % 10;
            k = i;
            for (j = 1; k / 10 >= 1; j++) {
                k = k / 10;
            }
            res = (int) (Math.pow(a, j) + Math.pow(b, j) + Math.pow(c, j) + Math.pow(d, j) + Math.pow(e, j) + Math.pow(f, j));
            if (res == i) {
                System.out.println(i);
            }
        }
    }
}
