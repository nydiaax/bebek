import java.util.Scanner;
public class newfaktor {
int N = 0;
int K = 0;
public static void main(String[] args) {
System.out.println("Input :");
Scanner BT = new Scanner(System.in);
int T = Integer.parseInt(BT.next());
new newfaktor().proses(T);
}
public int faktorial(int faktor){
int nilaiFaktor;
if(faktor<=1){
nilaiFaktor = 1;
}
else{
nilaiFaktor = faktor*faktorial(faktor-1);
}
return nilaiFaktor;
}
public int kombinasi(int N, int K) {
int nilaiAkhir;
if(N==1&&K==1){
nilaiAkhir = 1;
}
else{
nilaiAkhir = faktorial((N+K)-1)/(faktorial(K)*faktorial(N-1));
}
return nilaiAkhir;
}
public int proses(int T){
int success = 1;
hasil[] newhasil = new hasil[T];
int j = 0;
Scanner sc = new Scanner(System.in);
while(j < T){
String str = sc.nextLine();
int last = Integer.parseInt(str.substring(2));
int num = Integer.parseInt(str.substring(0, str.indexOf(" ")));
N = num;
K = last;
newhasil[j] = new hasil(kombinasi(N, K));
j++;
}
System.out.println("\nOutput :");
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