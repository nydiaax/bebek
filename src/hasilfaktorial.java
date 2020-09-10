import java.util.Scanner;
public class hasilfaktorial{
    public static void main (String[]args){
        Scanner masukan = new Scanner(System.in);

int n,hasil,i;
System.out.print("Masukan nilai yang di faktorialkan = ");
n = masukan.nextInt();
System.out.println("_________________________________________");
hasil=1;
for(i=2;i<=n;i++){
hasil=hasil*i;}
System.out.println("Jadi nilai Faktorial dari " +n+ " adalah " +hasil);
}
}