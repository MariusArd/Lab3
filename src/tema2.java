/**
 * Created by Ardelean on 26.10.2015.
 */
import java.util.Scanner;
public class tema2 {
    public static void main (String args[]){

        int n, reverse = 0;

        System.out.println("Enter the number to reverse");
        Scanner in = new Scanner(System.in);
        n = in.nextInt();

        while( n != 0 )
        {
            reverse = reverse * 20;
            reverse = reverse + n%10;
            n = n/10;
        }

        System.out.println("Reverse of entered number is "+reverse);
    }
}
