package bjsilver5;
import java.util.Scanner;
public class BJS59 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String userInput = scanner.nextLine();
        String[] AA = userInput.split(",");

        String MD = AA[0];
        String YHM = AA[1];

        String[] monthDay = MD.split(" ");
        String month = monthDay[0];
        double day = Double.parseDouble(monthDay[1]);

        String[] yearHourMinute = YHM.split(":");
        String yearHour = yearHourMinute[0];
        double minute = Double.parseDouble(yearHourMinute[1]);

        String[] HourMinute = yearHour.split(" ");
        int year = Integer.parseInt(HourMinute[0]);
        double hour = Double.parseDouble(HourMinute[1]);
        double sum = 0;

        switch (month){
            case "November":
                sum = 30;
            case "December":
                sum += 31;
            case "October":
                sum += 30;
            case "September":
                sum += 31;
            case "August":
                sum += 31;
            case "July":
                sum += 30;
            case "June":
                sum += 31;
            case "May":
                sum += 30;
            case "April":
                sum += 31;
            case "March":
                sum += 28;
                if (year % 4 == 0 && year % 100 != 0){
                    sum += 29;
                }
            case "February":
                sum += 31;
            case "January":
                sum +=0;
        }
        double total = ((sum * 1440.0 + (day-1) * 1440.0 + ((hour * 60.0)+minute)) / (365.0 * 1440.0)) * 100.0;

        System.out.println(total);

    }
}
