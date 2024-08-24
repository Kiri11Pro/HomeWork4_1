import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        int num, i, res;
        String b = "";
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число");
        num = scan.nextInt();
        i = 1;
        while (i < num) {
            i = i * 10;
            res = num % i / (i / 10);
            b = b + res;
        }
        String snum = "" + num;
        if (b.equals(snum)) {
            System.out.println("YES");
        } else System.out.println("NO");
    }
}
