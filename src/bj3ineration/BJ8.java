package bj3ineration;

import java.io.*;
import java.util.StringTokenizer;

public class BJ8 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine()); //StringTokenizer인자값에 입력 문자열 넣음
            int a = Integer.parseInt(st.nextToken()); //첫번째 호출
            int b = Integer.parseInt(st.nextToken()); //두번째 호출
            bw.write("Case #" + i + " : " + a + " + " + b + " = " + (a + b) + "\n");
        }
        bw.flush();
        bw.close();
    }
}
