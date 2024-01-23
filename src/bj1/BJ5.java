package bj1;
import java.util.Scanner;
public class BJ5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("세 수를 입력하세요: ");
        String userInput = scanner.nextLine();
        String[] AA = userInput.split(" ");

        int a = Integer.parseInt(AA[0]);
        int b = Integer.parseInt(AA[1]);
        int c = Integer.parseInt(AA[2]);

        System.out.printf("세 수의 합: %d", a+b+c);

    }
}
