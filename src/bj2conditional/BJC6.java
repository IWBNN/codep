package bj2conditional;
import java.util.Scanner;
public class BJC6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int c;
        int b;
        int a;
        do {
            System.out.print("3개의 주사위 수(1~6): ");

            String userInput = scanner.nextLine();
            String[] AA = userInput.split(" ");

            a = Integer.parseInt(AA[0]);
            b = Integer.parseInt(AA[1]);
            c = Integer.parseInt(AA[2]);
            int price = 0;
            int maxI = Integer.parseInt(AA[0]);
            for (int i = 0; i < 3; i++) {
                if (maxI < Integer.parseInt(AA[i]))
                    maxI = Integer.parseInt(AA[i]);
            }

            if (a < 0 || a > 6 || b < 0 || b > 6 || c < 0 || c > 6) {
                System.out.println("에러: 1~6 사이의 숫자를 다시 입력해주세요");
            }


            if (a == b && a == c)
                price = 10000 + a * 1000;
            else if ((a == b) && (a != c))
                price = 1000 + a * 100;
            else if (((a == c) && (a != b)))
                price = 1000 + a * 100;
            else if ((b == c) && (b != a))
                price = 1000 + b * 100;
            else
            price = maxI * 100;

            System.out.println(price);



        } while (a > 0 || a < 7 || b > 0 || b < 7 || c > 0 || c < 7);

    }
}
