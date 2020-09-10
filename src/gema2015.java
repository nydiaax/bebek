import java.io.*;


public class gema2015 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
            int T = Integer.parseInt(in.readLine());
            int N = 0 ;
            int K = 0 ;
            int hasil = 1, faktorial;
            for (int i = 0; i < T; i++) {
                String[] line = in.readLine().split(" ");
                int[] dim = new int[2];
                dim[0] = Integer.parseInt(line[0]);
                dim[1] = Integer.parseInt(line[1]);
                N = dim[0];
                K = dim [1];
               
            }
            for (int i = 0; i < T; i++) {
                hasil*=i;
               faktorial = hasil*(N+K-1)/(hasil*(K)*hasil*(N-1));
           
            System.out.println(hasil);
}    
}}