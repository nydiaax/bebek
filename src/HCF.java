import java.util.Scanner;
public class HCF {
            int N = 0 ;
            int K = 0 ;
            public static void main(String[] args) {
Scanner BT = new Scanner(System.in);
int T = Integer.parseInt(BT.next());
new HCF().proses(T);
}
public int kombinasi(int N, int K) {
int nilaiAkhir;
if (K>0){
}
nilaiAkhir=K;
K=N%K;
N=nilaiAkhir;
return nilaiAkhir;
}
public int proses(int T){
int success = 1;
hasil[] newhasil = new hasil[T];
int j = 0;
Scanner sc = new Scanner(System.in);
while(j < T){
String str = sc.nextLine();
int last = Integer.parseInt(str.substring(6));
int num = Integer.parseInt(str.substring(0, str.indexOf(" ")));
N = num;
K = last;
newhasil[j] = new hasil(kombinasi(N, K));
j++;
}
for (int m = 0; m < newhasil.length; m++){
System.out.println(newhasil[m].nilaiSimpanan);
}
return success;
}
class hasil
{
public int nilaiSimpanan;
hasil(int nilaiSimpanan)
{
this.nilaiSimpanan = nilaiSimpanan;
}
}
}