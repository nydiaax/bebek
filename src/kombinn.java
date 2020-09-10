import java.util.Scanner;
public class kombinn {

    private static int[] nilai;
   public static void main (String args[]){
   Scanner masuk = new Scanner(System.in);
   int N = 0, T, K = 0, hasil;
   T = masuk.nextInt();
    for(int i=0; i<2; i++){
        
        int nilai [][]=new int[T][T];
        nilai[N][K] = masuk.nextInt();
    }
        if (nilai[N]== 1 && nilai[K]==1){
                        hasil=1;
                }else
               hasil = faktorial (N+K-1) /(faktorial (K)* faktorial(N-1));
           
            System.out.println(hasil);
}

    private static int faktorial(int i) {
       
    
                int jml;
                if(i<=1)
                    jml=1;
                else
                    jml=i*faktorial(i-1);
                return(jml);
            }
}