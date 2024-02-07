package codeproject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Objects;
import java.util.Stack;

public class BJVPS { //9012
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            sb.append(solve(br.readLine())).append('\n');
        }
        System.out.println(sb);
//        String[] ArrayA = new String[T];
//
//        for (int i = 0; i < T; i++) {
//            String VPS = br.readLine();
//            int len = VPS.length();
//            String[] res = VPS.split("");
//            for (int j = 0; j < len; j++) {
//                if (Objects.equals(res[i], '(')) {
//                    count++;
//                } else {
//                    count--;
//                }
//
//                if (count < 0) {
//                    ArrayA[i] = "NO\n";
//                    break;
//                }
//            }
//            if (count == 0) {
//                ArrayA[i] = "Yes\n";
//            } else {
//                ArrayA[i] = "NO\n";
//            }
//        }
//        for(int i = 0;i < T;i++) {
//            System.out.print(ArrayA[i]);
//        }
    }

    public static String solve(String s) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c == '(') {
                stack.push(c);
            } else if (stack.empty()) {
                return "NO";
            } else {
                stack.pop();
            }
        }

            if (stack.empty()) {
                return "YES";
            } else {
                return "NO";
            }
        }
    }

