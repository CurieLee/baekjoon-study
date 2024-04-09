package step03;

import java.util.Scanner;
public class b8393 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();
        //int result = n * (n + 1) / 2;
        int result = 0;
        for (int i = 1; i <= N; i++)
            result += i;

        System.out.print(result);
    }
}
