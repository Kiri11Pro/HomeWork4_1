public class Task6 {
    public static void main(String[] args) {
        int i, a, b, c, d, e, f, g, h, k;
        k = 0;
        for (i = 10000000; i < 100000000; i++) {
            if (i % 12345 == 0) {
                a = i / 10000000;
                b = i % 10000000 / 1000000;
                c = i % 1000000 / 100000;
                d = i % 100000 / 10000;
                e = i % 10000 / 1000;
                f = i % 1000 / 100;
                g = i % 100 / 10;
                h = i % 10;
                if (a != b && a != c && a != d && a != e && a != f && a != g && a != h && b != c && b != d && b != e && b != f && b != g && b != h && c != d && c != e && c != f && c != g && c != h && d != e && d != f && d != g && d != h && e != f && e != g && e != h && f != g && f != h && h != g) {
                    System.out.println(i);
                    k++;
                }
            }
        }
        System.out.println("Общее количество чисел - " + k);
    }
}
