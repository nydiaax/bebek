import java.util.Scanner;

public class ifbercabang {
    public static void main(String[] args){
        Scanner masuk = new Scanner(System.in);
        int A, B, C;
        int batas=0;
        
        
        A = masuk.nextInt();
        B = masuk.nextInt();
        C = masuk.nextInt();
        
        batas = A + B + C;
        if(batas > 200){
            if (A > 50)
                System.out.println("Lolos");
            else if (B > 50)
                System.out.println("Lolos");
            else if (C > 50)
                System.out.println("Lolos");
            
        }  else
                System.out.println("Tidak Lolos"); 
    }
}
