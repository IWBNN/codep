package bj3ineration;
import java.util.Scanner;
public class BJ3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("n을 입력하세요: ");
        int n = scanner.nextInt();
        int sum = 0;
        for ( int i=1;i <= n; i++ ){
            sum +=i;
        }
        System.out.printf("%d\n", sum);
    }
}
