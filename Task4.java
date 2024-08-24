public class Task4 {
    public static void main(String[] args) {
        int num, j;
        for (int i = 6; i <= 1000000; i++) {
            num = 0;
            for (j = 1; i > j; j++) {
                if (i % j == 0) {
                    num += j;
                }
            }
            if (num == i)
                System.out.println(num);
        }
    }
}
