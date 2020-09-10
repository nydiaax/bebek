import java.util.Scanner;
public class bebek1 {
           public static void main (String [] args){
    {
        Scanner input = new Scanner (System.in);
        int B1, B2, B3;
        
        B1 = input.nextInt();
        B2 = input.nextInt();
        B3 = input.nextInt();
        
        if (B1<B2 && B1<B3)
            System.out.println(B1);
            else if (B2<B1 && B2<B3)
                System.out.println(B2);
                else if (B3<B1 && B3<B2){
                    System.out.println(B3);
                }
        
        if (B1>B2 && B1>B3)
            System.out.println(B1);
            else if (B2>B1 && B2>B3)
                System.out.println(B2);
                else if (B3>B1 && B3>B2){
                    System.out.println(B3);
    }
        if (B1<B2 && B1>B3)
                    System.out.println(B1);
        else if (B1>B2 && B1<B3)
            System.out.println(B1);
        else if (B2<B1 && B2>B3)
            System.out.println(B2);
        else if (B2>B1 && B2<B3)
            System.out.println(B2);
        else if (B3<B1 && B3>B2)
            System.out.println(B3);
        else if (B3>B1 && B3<B2)
            System.out.println(B3);
       


}
           }
}