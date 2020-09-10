import java.util.Scanner;
import java.util.regex.Pattern;
public class arraykata {
public static int maxValue(String karakter){
String [] angkaArray = karakter.split(" .");
int max = angkaArray[0].length(); //ngodingseruuutlx
String text = "abc"; 
String number; 
if (Pattern.matches("[0-9]+", text) == false && text.length() > 1) {
    System.out.println("NO"); 
}

for(int i=0;i<angkaArray.length;i++){ 
    if(angkaArray[i].length()>max){
max = angkaArray[i].length();

    }
}
return max;
}

public static void main(String[]args){
    Scanner masuk = new Scanner(System.in);
    String kata; 
kata= masuk.nextLine ();
System.out.println ();
int terpanjang = maxValue(kata);
System.out.print(terpanjang);
}
}
