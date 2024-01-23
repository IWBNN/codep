package bj4array;
import java.io.*;
import java.util.StringTokenizer;

public class BJA7 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] arrayA = new int[30];
        int[] arrayB = new int[30];
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = 0;
        for(a = 0;a < 30;a++){
            arrayA[a] = a+1;
        }
        for(int i = 0;i < 28; i++){
            arrayB[i] = Integer.parseInt(st.nextToken());
        }
        int[] amin = {0,0};
        for(a = 0;a<30;a++){
            for(int b = 0;b<30;b++){
                if(arrayA[a] == arrayB[b]){

                }
            }
        }
    }
}
