import java.util.Scanner;
public class Transpose {
  public static void main(String[] args){
    int A, j;
    int matriks[][] = new int[3][3]; 
    int transpose[][] = new int[3][3];
    Scanner scan = new Scanner(System.in);
    for(A = 0; A < 3; A++){
      for(j = 0; j< 3; j++){
        matriks[A][j] = scan.nextInt(3);
      }
    }
    for(A = 0; A < 3; A++){
      for(j = 0; j< 3; j++){
        transpose[j][A] = matriks[A][j];
      }
    }
    for(A = 0; A < 3; A++){
      for(j = 0; j< 3; j++){
        System.out.print(transpose[A][j] + " ");
      }
      System.out.println();
    }
  }
}