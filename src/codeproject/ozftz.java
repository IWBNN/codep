package codeproject;
import java.util.Scanner;
public class ozftz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("숫자 a b c 를 입력하세요:");

            // 사용자로부터 입력 받기
            String userInput = scanner.nextLine();
            String[] inputArray = userInput.split(" ");

            // 입력값 범위 검사 및 변수에 저장
            int a = validateAndParse(inputArray[0]);
            int b = validateAndParse(inputArray[1]);
            int c = validateAndParse(inputArray[2]);

            // 계산 및 출력
            System.out.println((a + b) % c);
            System.out.println(((a % c) + (b % c)) % c);
            System.out.println((a * b) % c);
            System.out.println((a % c) * (b % c) % c);

            // 사용자에게 계속할지 물어보기
            System.out.print("계속하시겠습니까? (y/n): ");
            String continueInput = scanner.nextLine().toLowerCase();

            if (!continueInput.equals("y")) {
                // 사용자가 계속하지 않는다면 반복문을 종료
                break;
            }
        }

        // Scanner 닫기
        scanner.close();
    }

    // 입력값을 검사하고 유효한 값으로 변환하는 메서드
    private static int validateAndParse(String input) {
        int value = Integer.parseInt(input);
        if (value < 2 || value > 10000) {
            System.out.println("입력값은 2 이상 10000 이하여야 합니다. 다시 입력하세요.");
            // 유효하지 않은 입력인 경우 -1을 반환하여 반복문이 계속 실행되도록 함
            return -1;
        }
        return value;
    }
}
