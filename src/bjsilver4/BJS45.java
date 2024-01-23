package bjsilver4;

import java.io.*;
import java.util.Objects;
import java.util.StringTokenizer;

public class BJS45 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        String[] ArrayA = new String[N+M];

        for(int i = 0;i < N+M;i++){
            ArrayA[i] = br.readLine();
        }

        int i = 0;
        int j = 0;
        int count = 0;
        int max = 100;
        int z = 0;
        String[] ArrayB = new String[max];
        for(i = 0;i < N;i++){
            for(j = N;j <N + M;j++) {
                if (Objects.equals(ArrayA[i], ArrayA[j])) {
                    count++;
                    ArrayB[z] = ArrayA[i];
                    z++;
                }
            }
        }
        bw.write(count+"\n");
        for(i = 0;i < count;i++) {
            bw.write(ArrayB[i] + "\n");
        }
        bw.flush();
        bw.close();

    }
}
