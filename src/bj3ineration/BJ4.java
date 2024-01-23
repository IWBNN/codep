package bj3ineration;
import java.util.Scanner;
public class BJ4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("총 금액 입력: ");
        int sum = scanner.nextInt();
        System.out.print("물건 종류의 개수 입력: ");
        int count = scanner.nextInt();

        int SS = 0;
        int price = 0;
        int c = 0;
        for(int i = 0;i<count;i++){
            System.out.print("물건의 가격과 개수 입력: ");
            price = scanner.nextInt();
            c = scanner.nextInt();
            SS += price * c;
        }
        if(sum == SS) System.out.println("YES");
        else System.out.println("NO");

    }
}
