package bj3ineration;

import java.util.Scanner;
public class BJ2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a;
        do {
            System.out.print("두 수 a b를 입력하세요(a를 0 입력시 종료): ");
            String userInput = scanner.nextLine();
            String[] AA = userInput.split(" ");

            a = Integer.parseInt(AA[0]);
            int b = Integer.parseInt(AA[1]);

            System.out.printf("A+B = %d\n", a + b);
        } while (a > 0);
    }
}
