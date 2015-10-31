/**
 * Created by Ardelean on 30.10.2015.
 */
import com.sun.prism.shader.Solid_ImagePattern_Loader;

import java.net.SocketOption;
import java.util.Scanner;
public class tema8 {
    public static void main(String[] args){
        System.out.println("Introduce-ti numarul pe care il doriti sa fie testat");
        Scanner in = new Scanner(System.in);
        int nr = in.nextInt();
        if(nr >= 9 && nr <= 24){
            System.out.println("True");
        }else{
            System.out.println("False");
        }



    }
}
