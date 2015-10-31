/**
 * Created by Ardelean on 30.10.2015.
 */

import java.util.Scanner;
public class tema10 {
    public static void main(String args[]){
        System.out.println("Introdu numarul ");
        Scanner in = new Scanner(System.in);
        int numar = in.nextInt();
        int prod = 1;


        for( int a = 1; a <= numar; a++ ){
            a = a * prod;
            System.out.println(a);


        }


    }
}