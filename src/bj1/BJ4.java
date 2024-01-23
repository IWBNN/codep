package bj1;
import java.util.Scanner;
public class BJ4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("첫번째 세자리 숫자를 입력하세요: ");
        int a = Integer.parseInt(scanner.nextLine());

        System.out.print("두번째 세자리 숫자를 입력하세요: ");
        int b = Integer.parseInt(scanner.nextLine());

        int c = a * (b%10);
        int d = a * (((b%100) - (b%10))/10);
        int e = a * ((b - (b%100))/100);
        int f = a * b;

        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);

    }
}
