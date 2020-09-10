import java.util.Scanner;

public class hitung {
    public static void main(String[] args) {
     Scanner x = new Scanner(System.in);
     int N;
     N = x.nextInt();
     for (int i=1; i<=N; i++){
         System.out.print(i);
         if(i != N)
         System.out.print("+");
    } 
  }
    
}

