package bj1;
import java.util.Objects;
import java.util.Scanner;
public class BJ2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String c = "??!";

        System.out.print("아이디를 입력하세요: ");
        String a = scanner.nextLine();
        System.out.println(a);

        System.out.print("아이디를 입력하세요: ");
        String b = scanner.nextLine();
        if(Objects.equals(a, b)){
            b = b+c;
            System.out.println(b);
        }


    }
}
