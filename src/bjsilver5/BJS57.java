package bjsilver5;
import java.util.Scanner;
public class BJS57 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        double T = (21.0 / 5.0);
//        System.out.println(T);


        String userInput = scanner.nextLine();
        String[] AA = userInput.split(" ");

        double a = Double.parseDouble(AA[0]);
        double b = Double.parseDouble(AA[1]);
        int c = Integer.parseInt(AA[2]);

        double sum = ((a / b) * (Math.pow(10.0,c)) % 10);
        System.out.println((int) sum);
    }
}
