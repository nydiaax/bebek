import java.util.Scanner;
public class segitigaasetengah { 
    public static void main(String[] args) 
    { 
        Scanner masuk = new Scanner(System.in);
         int N, h, k, j;
   N = masuk.nextInt();
   int nilai []=new int[N];
   
    for(int i=0; i<N; i++){
        nilai[i] = masuk.nextInt();
    }
      for(h=1 ; h<N ; h++)
{
    System.out.println("*");
}
for (k=1 ; k<nilai[h] ; k++)
{
    System.out.println("\n");
}
for (j=nilai[h] ; j>k ; j--)
{  
    System.out.println("\n");
}
    
    }}