package bjsilver5;
import java.util.Scanner;
import java.util.Random;
public class BJS55 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        Random rand = new Random();
        String str = scanner.nextLine();

        int a1 = rand.nextInt(0,str.length()-2);
        String a = str.substring(0,a1);

        int b1 = rand.nextInt(a1+1,str.length()-1);
        String b = str.substring(a1, b1);

        String c = str.substring(b1,str.length());

        StringBuffer sb1 = new StringBuffer(a);
        StringBuffer sb2 = new StringBuffer(b);
        StringBuffer sb3 = new StringBuffer(c);
        String reverse1 = sb1.reverse().toString();
        String reverse2 = sb2.reverse().toString();
        String reverse3 = sb3.reverse().toString();
        System.out.println(reverse1+reverse2+reverse3);


    }
}
