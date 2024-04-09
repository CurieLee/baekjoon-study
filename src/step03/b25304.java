package step03;

import java.util.Scanner;
public class b25304 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int total_check = 0;
        int total = scan.nextInt();
        int count = scan.nextInt();
        for (int i = 0; i < count; i++) {
            int product = scan.nextInt();
            int qty = scan.nextInt();
            total_check += product * qty;
        }

        if (total == total_check)   System.out.print("Yes");
        else                        System.out.print("No");
    }
}
