package bjsilver5;
import java.util.Scanner;
public class BJS56 { //1308
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int y1 = sc.nextInt();
        int m1 = sc.nextInt();
        int d1 = sc.nextInt();
        int y2 = sc.nextInt();
        int m2 = sc.nextInt();
        int d2 = sc.nextInt();

        int total1 = calcDay(y1, m1, d1);
        int total2 = calcDay(y2, m2, d2);

        if (y2 - y1 > 1000 || y2 - y1 == 1000 && (m1 < m2 || m1 == m2 && d1 <= d2)) System.out.println("gg");
        else System.out.println("D-" + (total2 - total1));
    }

    static int calcDay(int y, int m, int d) {
        int[] day = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        int days = 0;

        for (int i = 1; i < y; i++) {
            days += 365 + checkYear(i);
        }

        for (int i = 1; i < m; i++) {
            if (i == 2) days += checkYear(y);
            days += day[i];
        }

        days += d;

        return days;
    }

    static int checkYear(int y) {
        if ((y % 4 == 0 && y % 100 != 0) || y % 400 == 0) return 1;
        else return 0;
    }
}
//        Scanner scanner = new Scanner(System.in);
//
//        String userInput = scanner.nextLine();
//        String[] AA = userInput.split(" ");
//
//        int nYear = Integer.parseInt(AA[0]);
//        int nMonth = Integer.parseInt(AA[1]);
//        int nDay = Integer.parseInt(AA[2]);
//
//        String userInput2 = scanner.nextLine();
//        String[] AB = userInput2.split(" ");
//
//        int dYear = Integer.parseInt(AB[0]);
//        int dMonth = Integer.parseInt(AB[1]);
//        int dDay = Integer.parseInt(AB[2]);
//
//        int nSum = 0;
//        int dSum = 0;
//        int sumNMonth = 0;
//        int sumDMonth = 0;
//        int[] day = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
//
//        for (int i = 0;i<nMonth;i++){
//            sumNMonth += day[i];
//        }
//        for (int i = 0;i<dMonth;i++){
//            sumDMonth += day[i];
//        }
//        if(nYear % 4 == 0 && nYear % 100 != 0){
//            nSum = nYear*366 + sumNMonth + nDay;
//        } else if (nYear % 400 == 0) {
//            nSum = nYear*366 + sumNMonth + nDay;
//        } else {
//            nSum = nYear*365 + sumNMonth + nDay;
//        }
//        if(dYear % 4 == 0 && dYear % 100 != 0){
//            dSum = dYear*366 + sumDMonth + dDay;
//        } else if (dYear % 400 == 0) {
//            dSum = dYear*366 + sumDMonth + dDay;
//        } else {
//            dSum = dYear*365 + sumDMonth + dDay;
//        }
////        switch (nMonth) {
////            case 12:
////                sumMonth1 += 31;
////            case 11:
////                sumMonth1 += 30;
////            case 10:
////                sumMonth1 += 31;
////            case 9:
////                sumMonth1 += 30;
////            case 8:
////                sumMonth1 += 31;
////            case 7:
////                sumMonth1 += 31;
////            case 6:
////                sumMonth1 += 30;
////            case 5:
////                sumMonth1 += 31;
////            case 4:
////                sumMonth1 += 30;
////            case 3:
////                sumMonth1 += 31;
////            case 2:
////                sumMonth1 += 28;
////                if (dYear % 4 == 0 && dYear % 100 != 0){
////                    sumMonth1 += 29;
////                }
////            case 1:
////                sumMonth1 += 31;
////                break;
////        }
////        switch (dMonth) {
////            case 12:
////                sumMonth2 += 31;
////            case 11:
////                sumMonth2 += 30;
////            case 10:
////                sumMonth2 += 31;
////            case 9:
////                sumMonth2 += 30;
////            case 8:
////                sumMonth2 += 31;
////            case 7:
////                sumMonth2 += 31;
////            case 6:
////                sumMonth2 += 30;
////            case 5:
////                sumMonth2 += 31;
////            case 4:
////                sumMonth2 += 30;
////            case 3:
////                sumMonth2 += 31;
////            case 2:
////                sumMonth2 += 28;
////                if (dYear % 4 == 0 && dYear % 100 != 0){
////                    sumMonth2 += 29;
////                }
////            case 1:
////                sumMonth2 += 31;
////                break;
////        }
//
//        int sum = dSum - nSum;
//        // y2 - y1 > 1000 || y2 - y1 == 1000 && (m1 < m2 || m1 == m2 && d1 <= d2
//
//        if (dYear - nYear > 1000 || dYear - nYear == 1000 && (dMonth < nMonth || dMonth == nMonth && dDay <= nDay)){
//            System.out.println("gg");
//        }else System.out.println("D-"+sum);
