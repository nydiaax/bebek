import java.util.Scanner;

public class pergeserankata{
    public static void main(String[] args){
        Scanner in = new Scanner (System.in);
        int N;
        int M;
        N = in.nextInt();
        M= in.nextInt();
        String kata = "";
        String hasil = "";
        char temp;
        for (int i=0;i<N;i++){
            kata = in.next();
            
        }
        
        hasil = "";
        
            char[] kar = kata.toCharArray();
            int panjang = kata.length();
       
            for (int j = 0;j<M;j++){
                
                temp = kar[0];
                for (int k=0;k<panjang-1;k++){
                    kar[k] = kar[k+1];
                }
                kar[panjang-1] = temp;
                for(int p=0;p<kata.length();p++){
                    hasil += kar[p];
                }
            }
            System.out.println(hasil);
        }
    }