package bj2conditional;
import java.util.Scanner;
public class BJC5 { //알람, 오븐 시계
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("현재 시간을 입력하세요: ");
        String userInput = scanner.nextLine();
        String[] AA = userInput.split(" ");

        int H = Integer.parseInt(AA[0]);
        int M = Integer.parseInt(AA[1]);

        System.out.print("오븐 시간을 입력하세요: ");
        int a = Integer.parseInt(scanner.nextLine());

        int b = (M + a)/60;

        if (M + a < 60)
            System.out.printf("%d %d", H, M + a);

        else if((H == 23) && (M + a > 60))
            System.out.printf("%d %d", b - 1, M + a - 60 * b);

        else
            System.out.printf("%d %d",H + b, M + a - 60 * b);

    }
}
