import java.io.*;
public class faktorial {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));   
        
        int T = Integer.parseInt(in.readLine());
            int N = 0 ;
            int K = 0 ;
            int faktorial=1; int hasil;
            for (int i = 0; i < T; i++) {
                String[] line = in.readLine().split(" ");
                int[] dim = new int[2];
                dim[0] = Integer.parseInt(line[0]);
                dim[1] = Integer.parseInt(line[1]);
                N = dim[0];
                K = dim [1];
                    if (N== 1 && K==1){
                        hasil=1;
                }else
               hasil = faktorial (N+K-1) /(faktorial (K)* faktorial(N-1));
           
            System.out.println(hasil);
}
    } private static int faktorial(int faktor){
                int jml;
                if(faktor<=1)
                    jml=1;
                else
                    jml=faktor*faktorial(faktor-1);
                return(jml);
            }
    private static int hasil(int f){
        if(f==1){
            return 1;
    }
            return(f*hasil (f-1));
            
}}