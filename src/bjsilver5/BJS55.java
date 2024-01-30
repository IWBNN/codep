package bjsilver5;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.LinkedList;
public class BJS55 { // 1251
    //        Scanner scanner =new Scanner(System.in);
//        Random rand = new Random();
//        String str = scanner.nextLine();
//
//        int a1 = rand.nextInt(0,str.length()-2);
//        String a = str.substring(0,a1);
//
//        int b1 = rand.nextInt(a1+1,str.length()-1);
//        String b = str.substring(a1, b1);
//
//        String c = str.substring(b1,str.length());
//
//        StringBuffer sb1 = new StringBuffer(a);
//        StringBuffer sb2 = new StringBuffer(b);
//        StringBuffer sb3 = new StringBuffer(c);
//        String reverse1 = sb1.reverse().toString();
//        String reverse2 = sb2.reverse().toString();
//        String reverse3 = sb3.reverse().toString();
//        System.out.println(reverse1+reverse2+reverse3);
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        LinkedList<String> list = new LinkedList<>();
        for (int i = 2; i < str.length(); i++) {
            for (int j = 1; j < i; j++) {
                StringBuilder strSb1 = new StringBuilder(str.substring(0, j));
                StringBuilder strSb2 = new StringBuilder(str.substring(j, i));
                StringBuilder strSb3 = new StringBuilder(str.substring(i));
                String str1 = strSb1.reverse().toString();
                String str2 = strSb2.reverse().toString();
                String str3 = strSb3.reverse().toString();
                list.add(str1 + str2 + str3);

            }
        }
        Collections.sort(list);
        System.out.println(list.pop());

    }

}
