package bjsilver5;
import java.util.Scanner;
public class BJS56 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String userInput = scanner.nextLine();
        String[] AA = userInput.split(" ");

        int nYear = Integer.parseInt(AA[0]);
        int nMonth = Integer.parseInt(AA[1]);
        int nDay = Integer.parseInt(AA[2]);

        String userInput2 = scanner.nextLine();
        String[] AB = userInput2.split(" ");

        int dYear = Integer.parseInt(AB[0]);
        int dMonth = Integer.parseInt(AB[1]);
        int dDay = Integer.parseInt(AB[2]);

        int sYear = 0;
        int sMonth = 0;
        int sDay = 0;
        sYear = dYear - nYear;
        int sumMonth1 = 0;
        int sumMonth2 = 0;
        switch (nMonth) {
            case 12:
                sumMonth1 += 31;
            case 11:
                sumMonth1 += 30;
            case 10:
                sumMonth1 += 31;
            case 9:
                sumMonth1 += 30;
            case 8:
                sumMonth1 += 31;
            case 7:
                sumMonth1 += 31;
            case 6:
                sumMonth1 += 30;
            case 5:
                sumMonth1 += 31;
            case 4:
                sumMonth1 += 30;
            case 3:
                sumMonth1 += 31;
            case 2:
                sumMonth1 += 28;
                if (dYear % 4 == 0 && dYear % 100 != 0){
                    sumMonth1 += 29;
                }
            case 1:
                sumMonth1 += 31;
                break;
        }
        switch (dMonth) {
            case 12:
                sumMonth2 += 31;
            case 11:
                sumMonth2 += 30;
            case 10:
                sumMonth2 += 31;
            case 9:
                sumMonth2 += 30;
            case 8:
                sumMonth2 += 31;
            case 7:
                sumMonth2 += 31;
            case 6:
                sumMonth2 += 30;
            case 5:
                sumMonth2 += 31;
            case 4:
                sumMonth2 += 30;
            case 3:
                sumMonth2 += 31;
            case 2:
                sumMonth2 += 28;
                if (dYear % 4 == 0 && dYear % 100 != 0){
                    sumMonth2 += 29;
                }
            case 1:
                sumMonth2 += 31;
                break;
        }
        sMonth = sumMonth2 - sumMonth1;


        sDay = dDay - nDay;

        int sum = 0;
        sum = sYear * 365 + sMonth + sDay;
        if (sYear >= 1000){
            System.out.println("gg");
        }else System.out.println("D-"+sum);
    }
}
