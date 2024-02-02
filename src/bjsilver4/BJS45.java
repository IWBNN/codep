package bjsilver4;

import java.io.*;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Objects;
import java.util.StringTokenizer;

public class BJS45 { //1764 ( 시간초과 )
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

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
        String[] ArrayB = new String[N+M];
        for(i = 0;i < N;i++){
            for(j = N;j <N + M;j++) {
                if (Objects.equals(ArrayA[i], ArrayA[j])) {
                    count++;
                    ArrayB[z] = ArrayA[i];
                    z++;
                }
            }
        }
        sb.append(count).append('\n');
        Arrays.sort(ArrayB, 0, count); // ArrayB의 0번 인덱스부터 count - 1까지 정렬
        for(i = 0;i < count;i++) {
            sb.append(ArrayB[i]).append('\n');
            if(ArrayB[i] == null){
                break;
            }
        }
        System.out.println(sb);
        bw.flush();
        bw.close();

    }
}
