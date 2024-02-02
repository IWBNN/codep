package bjsilver4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJS41049 { //1049
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringTokenizer st2;
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int min = 1000;
        int temp = 1000;
        int pacPrice = 0;
        int piecePrice = 0;
        int minPacPrice = 1000;
        int minPiecePrice = 1000;
        for (int i = 0; i < M; i++) {
            st2 = new StringTokenizer(br.readLine());
            pacPrice = Integer.parseInt(st2.nextToken());
            if(minPacPrice > pacPrice){
                minPacPrice = pacPrice;
            }
            piecePrice = Integer.parseInt(st2.nextToken());
            if(minPiecePrice > piecePrice){
                minPiecePrice = piecePrice;
            }
            temp = Math.min(min,minPacPrice*(N/6) + minPiecePrice * (N-(6 *(N/6))));
            if(N * minPiecePrice < temp){
                temp = N * minPiecePrice;
            }
            if(minPacPrice * (N/6 + 1) < temp){
                temp = minPacPrice * (N/6 + 1);
            }
            if (min > temp){
                min = temp;
            }
        }
        System.out.println(min);
    }
}
