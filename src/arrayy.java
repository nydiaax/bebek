import java.util.Scanner;
public class arrayy {
   public static void main (String args[]){
   Scanner masuk = new Scanner(System.in);
   int N;
   N = masuk.nextInt();
   int nilai []=new int[N];
   
    for(int i=0; i<N; i++){
        nilai[i] = masuk.nextInt();
        
    }
        for(int i=0;i<N;i++){
            if (nilai[i] < 0)
            System.out.println(nilai[i]);
             
}
        for(int i=0;i<N;i++){
            if (nilai[i] == 0)
            System.out.println(nilai[i]);
}
                    for(int i=0;i<N;i++){
            if (nilai[i] > 0)
            System.out.println(nilai[i]);
   }
   }
}