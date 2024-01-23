package bjsilver5;
import java.io.*;
import java.util.StringTokenizer;

public class BJS51 {

    static long factorial(int n) {
        if (n == 0) {
            return 1L;
        }
        long result = 1L;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int T = Integer.parseInt(br.readLine());
        Long[] sum = new Long[T];
        for (int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            long f1 = factorial(a);
            long f2 = factorial(b);
            long f3 = factorial(b - a);
            sum[i] = f2 / (f1 * f3);
        }
        for (int i = 0; i < T; i++) {
            bw.write(sum[i] + "\n");
        }
        bw.flush();
        bw.close();
    }
}
