import java.util.Scanner;
import java.text.DecimalFormat;
public class segitiga {
    public static void main(String[] args){
        Scanner masuk = new Scanner(System.in);
        DecimalFormat digit = new DecimalFormat("0.00");
        double A, T, Luas;
        
        A = masuk.nextDouble();
        T = masuk.nextDouble();
        
        Luas = (double)0.5*A*T;
        System.out.println(digit.format(Luas));
        
    }
}

