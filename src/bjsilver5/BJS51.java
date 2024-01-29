package bjsilver5;
import java.io.*;
import java.util.StringTokenizer;

public class BJS51 { //1010

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int[][] arrayA = new int[30][30];
        int i = 0;
        int j = 0;
        for (i = 0;i<30;i++){
            arrayA[i][i] = 1;
            arrayA[i][0] = 1;
        }

        for(i = 2;i<30;i++){
            for(j = 1;j<30;j++){
                arrayA[i][j] = arrayA[i-1][j-1] + arrayA[i-1][j];
            }
        }
        StringTokenizer st;

        int T = Integer.parseInt(br.readLine());
        for(i = 0;i<T;i++){
            st = new StringTokenizer(br.readLine(), " ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            sb.append(arrayA[b][a]).append('\n');
        }
        System.out.println(sb);
    }
}
