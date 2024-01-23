package bj3ineration;

import java.util.Scanner;
public class BJ1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = 0;

        System.out.print("n값을 입력하세요: ");
        int n = Integer.parseInt(scanner.nextLine());
        for(i = 0;i<10;i++){
            System.out.printf("%d * %d = %d\n", n, i+1, n * (i + 1));
        }
    }
}
