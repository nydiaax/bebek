import java.util.Arrays;
import java.util.Scanner;
public class gema2016 {
   public static void main(String[] args){
        Scanner masuk = new Scanner(System.in);
        int N = masuk.nextInt();
        int[] array = new int[N];
        for(int i=0; i<N; i++){
            array[i] = masuk.nextInt();
   }
        Arrays.sort(array);
        for(int index: array){
            System.out.println(index);
}
}
}