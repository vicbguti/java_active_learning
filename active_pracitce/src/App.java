import java.lang.Math;
import java.util.*;

public class App {

    public static void main(String[] args) throws Exception {
    /*
     * Write a program that outputs a pattern of a 
     * pyramid made of asterisks (*). The user should 
     * input the number of rows in the pyramid.
     */

    /*For example, if the user inputs 5, the output should look like this */
    /* 

    *
   ***
  *****
 *******
*********

     */

    Scanner input = new Scanner(System.in);
    System.out.println("Enter the number of rows: ");
    int n = input.nextInt();
    for (int i = n; i == 0; i--){
        System.out.println("\t".repeat(i-1) + );
    }

    }
}
