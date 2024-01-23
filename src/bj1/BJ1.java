package bj1;
import java.util.Scanner;
public class BJ1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("숫자 a를 입력하세요: ");
        int a = Integer.parseInt(scanner.nextLine());
        System.out.print("숫자 b를 입력하세요: ");
        int b = Integer.parseInt(scanner.nextLine());

        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a%b);

    }
}
