public class Task1 {
    public static void main(String[] args) {
        int a, b, c, max;
        a = 0;
        b = 1;
        max = 0;
        while (max <= 10000000) {
            System.out.println(a);
            System.out.println(b);
            c = a + b;
            System.out.println(c);
            a = b + c;
            b = c + a;
            if (a > b && a > c) {
                max = a;
            } else {
                if (b > c) {
                    max = b;
                } else max = c;
            }
        }
    }
}
