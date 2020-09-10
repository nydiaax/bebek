import java.util.Scanner;
public class segitigaasetengah2 {

public static void main(String[] args) {
Scanner input = new Scanner(System.in);
int a, b, N;
N = input .nextInt();
int baris []=new int[N];
for (int i = 0; i < N; i++) {
baris[i]= input.nextInt();
}
for (int i = 0; i < N; i++) {
    System.out.println("");
for (a=1; a<=baris[i]; a++) {
for (b=a ; b<=baris[i] ; b++) {
System.out.print("*");
}
System.out.println();
}
}
}
}

