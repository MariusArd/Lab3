/**
 * Created by Ardelean on 30.10.2015.
 */
import java.util.Scanner;
public class tema9 {
    public static void main(String []args){
        System.out.println("Introdu numarul a");
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();

        System.out.println("Introdu numarul b");
        in = new Scanner(System.in);
        int b = in.nextInt();

        int c = 1; //rezultat
        for(int i = 1 ;  i <= b; i++){

            c = a*c;

        }
        System.out.println(c);
    }
}
