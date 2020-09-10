import java.util.Scanner;
public class bebek {
    public static void main(String[] args){
        Scanner masuk = new Scanner(System.in);
        int N, M, bagi, sisa;
        N = masuk.nextInt();
        M = masuk.nextInt();
       
        bagi = N / M;
        System.out.println("masing-masing " + bagi);
        sisa = N % M;
        System.out.println("bersisa " + sisa);
        
    }
}
