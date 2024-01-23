package bjsilver4;
import java.util.Scanner;
public class BJS43 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int count = 99;

        int A = N / 100;
        int B = N / 10 - A*10;
        int C = N - A * 100 - B * 10;

        if((B - A) == (C - B)){
            count++;
        }
        System.out.println(count);
    }
}
