package bj2conditional;
import java.util.Scanner;
public class BJC1 { //두 수 비교
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("크기를 두 수를 입력하세요: ");
        String userInput = scanner.nextLine();
        String[] AA = userInput.split(" ");

        int a = Integer.parseInt(AA[0]);
        int b = Integer.parseInt(AA[1]);

        if (a > b)
            System.out.println(">");
        else if (a == b)
            System.out.println("=");
        else
            System.out.println("<");
    }
}
