package step01;

import java.util.Scanner;
public class b2588 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
        int b = scan.nextInt();

        int c = (b % 10) * a;
        int d = (b % 100) / 10 * a;
        int e = (b / 100) * a;

        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.print(a * b);
    }
}
