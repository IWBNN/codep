package bj2conditional;
import java.util.Scanner;
public class BJC3 { //윤년
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("연도를 입력하세요: ");
        int a = Integer.parseInt(scanner.nextLine());

        if (a % 4 == 0)
            System.out.print("1");
        else
            System.out.print("0");
    }
}
