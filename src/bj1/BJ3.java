package bj1;
import java.util.Scanner;

public class BJ3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("불기 연도를 입력하세요: ");
        int a = Integer.parseInt(scanner.nextLine());

        int b = 543;

        System.out.printf("서기 연도: %d",a-b);
    }
}
