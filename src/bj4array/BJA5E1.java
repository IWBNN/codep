package bj4array;
import java.io.*;
import java.util.Random;
import java.util.StringTokenizer;

public class BJA5E1 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringTokenizer st2;
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int i;
        int j;
        int k;
        Random rand = new Random();
        int[] arrayA = new int[100];
        for(int z = 0;z < M;z++){
            st2 = new StringTokenizer(br.readLine());
            i = Integer.parseInt(st2.nextToken());
            j = Integer.parseInt(st2.nextToken());
            k = Integer.parseInt(st2.nextToken());
            if (i<j) {
                for (int w = 0; w < k; w++) {
                    arrayA[(int) (Math.random() * (j - i + 1) + i)]++;
                }
            }
        }
        for(int z = 1;z <= N;z++) {
            bw.write(arrayA[z] + " ");
        }
        bw.flush();
        bw.close();
    }
}
