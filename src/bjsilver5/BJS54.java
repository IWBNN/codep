package bjsilver5;
import java.util.Scanner;
public class BJS54 { // 1193
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int X = scanner.nextInt();

        int a = 1;
        int b = 1;

        boolean up = true;  // 방향을 나타내는 플래그

        for (int i = 1; i < X; i++) {
            if (up) {
                a--;
                b++;
            } else {
                a++;
                b--;
            }

            if (a == 0) {
                up = !up;
                a++;
            } else if (b == 0) {
                up = !up;
                b++;
            }
        }

        System.out.println(a + "/" + b);
    }
//        Scanner scanner = new Scanner(System.in);
//        int X = scanner.nextInt();
//        int a = 1;
//        int b = 1;
//        int c= 2;
//        int sum = 0;
//        String[] StrA = new String[1000000];
//        StrA[0] = a + "/" + b;
//        for(int i = 0;i<10; i++){
//            for(int j = 1;j < c+1; j++){
//                if(c % 2 == 0) {
//                    if(a == 1) b++;
//                    StrA[j + sum] = a + "/" + b;
//                    if (b != 1){a++;
//                    b--;}
//                }
//                else{
//                    if(b == 1) a++;
//                    StrA[j + sum] = a + "/" + b;
//                    if(a != 1){a--;
//                    b++;}
//                }
//            }
//            sum+=c;
//            c++;
//        }
//
//        System.out.println(StrA[X - 1]);
}
