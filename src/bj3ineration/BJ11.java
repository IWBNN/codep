package bj3ineration;
import java.io.*;
import java.util.StringTokenizer;

public class BJ11 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        int i = 0;
        int a = 1;
        int b = 1;
        int[] arrayA = new int[10];
        while (a != 0 && b != 0) {
            st = new StringTokenizer(br.readLine());
            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());
            arrayA[i] = a + b;
            i++;

        }
        for(int j = 0;j < i-1;j++){
            bw.write(arrayA[j] + "\n");
        }
        bw.flush();
        bw.close();
    }
}
