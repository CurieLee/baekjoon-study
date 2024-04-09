package step02;

import java.util.Scanner;
public class b2525 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int H = scan.nextInt();
        int M = scan.nextInt();
        int time = scan.nextInt();

        H += time / 60;
        M += time % 60;

        if (60 <= M) {
            H++;
            M -= 60;
        }
        if (24 <= H)
            H -= 24;

        System.out.print(H + " " + M);
    }
}
