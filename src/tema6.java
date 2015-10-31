/**
 * Created by Ardelean on 28.10.2015.
 */

import java.util.Scanner;

public class tema6 {
    public static void main(String args[]){
        System.out.println("Introduce-ti numarul ");

        int numar;
        Scanner in = new Scanner(System.in);
        numar = in.nextInt();

        int sumaGauss = numar*(numar+1)/2;
        System.out.println("Suma primelor " + numar + " de numere este: " + sumaGauss);

    }
}
