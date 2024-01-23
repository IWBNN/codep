package bj2conditional;
import java.util.Scanner;
public class BJC2 { //시험성적
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("성적(숫자)를 입력하세요: ");
        int a = Integer.parseInt(scanner.nextLine());

        int point = a / 10;
        switch (point) {
            case 10:
            case 9:
                System.out.print("A");
                break;
            case 8:
                System.out.print("B");
                break;
            case 7:
                System.out.print("C");
                break;
            case 6:
                System.out.print("D");
                break;
            default:
                System.out.print("F");
                break;

        }
    }
}
