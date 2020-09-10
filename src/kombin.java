import java.util.Scanner;
public class kombin {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        for(int a=1;;a++){
            System.out.println("Program Perhitungan Kombinasional dan Permutasi");
            System.out.println("1.Meghitung Permutasi");
            System.out.println("2.Menghitung Kombinasi");
            System.out.println("3.keluar");
            System.out.print("Masukkan pilihan Anda : ");
            a=in.nextInt();
            switch(a){
                case 1:
                    System.out.print("Masukkan nilai n : ");
                    int np=in.nextInt();
                    System.out.print("Masukkan nilai r : ");
                    int rp=in.nextInt();
                    permutasi (np,rp);
                    break;
                case 2:
                    System.out.print("Masukkan nilai n : ");
                    int nc=in.nextInt();
                    System.out.print("Masukkan nilai r : ");
                    int rc=in.nextInt();
                    kombinasi (nc,rc);
                    break;
                case 3:
                    System.exit(0);
                    break;
                default:
 
                    System.out.print("Maaf ulangi lagi pilihan anda!");
            }
            System.out.println("");System.out.println("");
 
            }
    }
    public static void permutasi (int np,int rp){
            int permut =faktorial(np)/faktorial(np-rp);
            System.out.println("        n!");
            System.out.println("nPr=---------="+permut);
            System.out.println("      (n-r)!");
            System.out.print("Maka hasil Permutasi adalah : "+permut);
    }
    public static void kombinasi (int n1,int r1){
        int kombin =faktorial(n1)/ (faktorial(n1-r1)*faktorial(r1));
            System.out.println("         n!");
            System.out.println("nCr=--------------="+kombin);
            System.out.println("     (n-r)! x r!");
            System.out.print("Maka hasil Kombinasi adalah  : "+kombin);
    }
    public static int faktorial(int f){
        if(f==1)
            return 1;
        else
            return (f*faktorial (f-1));
    }
}