package bj4array;
import java.io.*;
public class BJA4 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] ArrayA = new int[9];
        int aMax = ArrayA[0];
        int num = 0;
        for(int i = 0;i < 9;i++){
            ArrayA[i] = Integer.parseInt(br.readLine());
            if (aMax < ArrayA[i]){
                aMax = ArrayA[i];
                num = i;
            }
        }
        bw.write(aMax + " " + (num + 1));
        bw.flush();
        bw.close();
    }
}
