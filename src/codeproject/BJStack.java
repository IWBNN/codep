package codeproject;
import java.util.Objects;
import java.util.Scanner;
import java.util.Stack;

public class BJStack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<Integer> stackInt = new Stack<>();

        int T = scanner.nextInt();
        scanner.nextLine(); // 엔터 문자 소진

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < T; i++) {
            String userInput = scanner.nextLine();
            String[] AA = userInput.split(" ");

            String a = AA[0];

            // AA 배열의 길이가 2 이상이고, AA[1]이 비어 있지 않을 때만 b에 값을 할당
            int b = (AA.length >= 2 && !AA[1].isEmpty()) ? Integer.parseInt(AA[1]) : 0;

            if (Objects.equals(a, "push")) {
                stackInt.push(b);
            } else if (Objects.equals(a, "pop")) {
                if (stackInt.isEmpty()) {
                    result.append("-1\n");
                } else {
                    result.append(stackInt.peek()).append("\n");
                    stackInt.pop();
                }
            } else if (Objects.equals(a, "size")) {
                result.append(stackInt.size()).append("\n");
            } else if (Objects.equals(a, "empty")) {
                result.append(stackInt.isEmpty() ? "1\n" : "0\n");
            } else if (Objects.equals(a, "top")) {
                result.append(stackInt.isEmpty() ? "-1\n" : stackInt.peek() + "\n");
            } else {
                break;
            }
        }

        // 결과 출력
        System.out.println(result.toString());
    }
}
