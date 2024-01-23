package bjsilver4;

import java.io.*;
import java.util.StringTokenizer;

public class BJS46 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(br.readLine());
        
        int[] A = new int[N];
        int i = 0;
        for(i = 0;i < N;i++){
            A[i] = Integer.parseInt(st.nextToken());
        }
        int M = Integer.parseInt(br.readLine());
        int[] B = new int[M];
        for(i = 0;i < N;i++){
            B[i] = Integer.parseInt(st.nextToken());
        }

        for(i = 0;i < N;i++){
            for(int j = 0;j < M;j++){
                if (B[i] == A[j]){
                    bw.write(B[i] + "\n");
                }
            }
        }
        bw.flush();
        bw.close();
    }
}
