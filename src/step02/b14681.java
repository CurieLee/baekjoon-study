package step02;

import java.util.Scanner;
public class b14681 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int x = scan.nextInt();
        int y = scan.nextInt();

        if (0 < x && 0 < y)         System.out.print(1);
        else if (x < 0 && 0 < y)    System.out.print(2);
        else if (x < 0 && y < 0)    System.out.print(3);
        else if (0 < x && y < 0)    System.out.print(4);
    }
}
