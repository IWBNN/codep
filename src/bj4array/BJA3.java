package bj4array;
import java.io.*;
import java.util.StringTokenizer;

public class BJA3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arrayA = new int[T];
        int aMax = arrayA[0];
        int aMin = arrayA[0];
        for(int i = 0;i < T; i++){
            arrayA[i] = Integer.parseInt(st.nextToken());
            if(i == 0){
                aMax = arrayA[0];
                aMin = arrayA[0];
            }
            if(aMax < arrayA[i]){
                aMax = arrayA[i];
            }
            if(aMin>arrayA[i]){
                aMin = arrayA[i];
            }
        }
        bw.write(aMin + " " + aMax);
        bw.flush();
        bw.close();
    }
}
