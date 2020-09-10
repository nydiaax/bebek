import java.util.Scanner;

public class logn{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        for(int i=0;i<N;i++){
            int angka = in.nextInt();
            int hasil = 1;
            for(int j=1;j<=angka;j++){
                hasil = hasil*j;
            }
            double h = Math.log10(hasil);
            System.out.format("%.2f\n", h);
        }
    }
}