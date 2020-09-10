import java.util.Scanner;
public class poligon {
  public static void main(String[] args) {
    int minimum, jumlah, i,lokasi = 0;
    Scanner scan = new Scanner(System.in);
    jumlah = scan.nextInt();
    
    for(i = 0; i < jumlah; i++) {
      int array [][] = new int[jumlah][jumlah];
      array[i][i] = scan.nextInt();
    }
      int[][] array = null;
    minimum = array[0][0];
    for(i = 0; i < jumlah; i++) {
      if (array[i][i] > minimum){
        minimum = array[i][i];
         lokasi = i-1;
      }
    }
    System.out.println("Nilai makasimum adalah "+minimum+" berada di elemen ke "+lokasi);
    
  }
}

