package bjsilver4;

import java.io.*;
import java.sql.Array;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class BJS46 { // 1920 (시간초과)
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        int[] A = new int[N];
        int i = 0;
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for(i = 0;i < N;i++){
            A[i] = Integer.parseInt(st.nextToken());
        }
        int M = Integer.parseInt(br.readLine());
        int[] B = new int[M];
        StringTokenizer st2 = new StringTokenizer(br.readLine(), " ");
        for(i = 0;i < N;i++){
            B[i] = Integer.parseInt(st2.nextToken());
        }
        int sum = 0;
        int count = 0;
        for(i = 0;i < N;i++){
            for(int j = 0;j < M;j++){
                if (B[i] == A[j]){
                    sum = 1;
                    count =0;
                    sb.append(1).append('\n');
                    break;
                } else{
                    sum = 0;
                    count++;
                }
            }
            if(count != 0){
                sb.append(0).append('\n');
            }
        }
        bw.write(String.valueOf(sb));
        bw.flush();
        bw.close();
    }
}
