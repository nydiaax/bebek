import java.io.*;
import java.util.Arrays;

public class ps222 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
            int T = Integer.parseInt(in.readLine());
            int N = 0;
            int K = 0;
            int hasil = 1, faktorial, num;
            for (int i = 0; i < T; i++) {
                int[][] tabel = new int[2][];
                tabel[0] = new int[4];
                tabel[1] = new int[2];
                tabel[2] = new int[3];
            }
                for (int i = 0; i < N; i++) {
                
           
               hasil=hasil*i;}
               hasil = hasil*(N+K-1)/(hasil*(K)*hasil*(N-1));
            
            System.out.println(hasil);
        }
    }