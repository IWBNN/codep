package bj2conditional;
import java.util.Scanner;
public class BJC4 { //사분면
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("x: ");
        int x = Integer.parseInt(scanner.nextLine());

        System.out.print("y: ");
        int y = Integer.parseInt(scanner.nextLine());

        if (x > 0 && y > 0)
            System.out.print("1");
        else if (x < 0 && y > 0)
            System.out.print("2");
        else if (x < 0 && y < 0)
            System.out.print("3");
        else if (x > 0 && y < 0)
            System.out.print("4");
        else
            System.out.print("on the line");

    }
}
