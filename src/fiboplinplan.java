import java.util.Scanner;
public class fiboplinplan {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
int a, b, c, d, e;
int jc = input.nextInt();
int[]fibo = new int[jc];
for (int i = 0; i < jc; i++) {
fibo[i]= input.nextInt();
}

for(int i=0; i<jc; i++){
a=0; b=1; c=0; e=0;
for(int j=1; j<=fibo[i]; j++){
a=b+c;
b=c;
c=a;
if(j%2==0){
d=a-a-a;
}
else
{
d=c;
}
e=e+d;
}
System.out.println(e);
}
}
}