package bj4array;
import java.io.*;
import java.util.StringTokenizer;

public class BJA2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int T = Integer.parseInt(st.nextToken());
        int X = Integer.parseInt(st.nextToken());
        int[] ArrayA = new int[T];
        StringTokenizer st2 = new StringTokenizer((br.readLine()));
        int i;
        for (i = 0; i < T; i++) {
            ArrayA[i] = Integer.parseInt(st2.nextToken());
            }
        for (i = 0; i < T;i++) {
        if (ArrayA[i] < X) {
            bw.write(ArrayA[i] + " ");
        }
    }
        bw.flush();
        bw.close();
    }
}
