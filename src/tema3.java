
/**
 * Created by Ardelean on 26.10.2015.
 */
        import java.util.Scanner;

        public class tema3 {

                public static void main (String args[]) {
                    String original, reverse = "";
                    Scanner in = new Scanner(System.in);

                    System.out.println("Enter a string to check if it is a palindrome");
                    original = in.nextLine();

                    int length = original.length();
                    for(int i= length -1; i >=0; i--)
                        reverse = reverse + original.charAt(i);

                    if(original.equals(reverse)) {
                        System.out.println("This son of a bitch is a palindrome");

                    }else{
                        System.out.println("Nu e un polidrom, mai incearca!");

                        }

                    }





                }
