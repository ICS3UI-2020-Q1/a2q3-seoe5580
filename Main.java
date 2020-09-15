import java.util.Scanner;

/**
 * Allows you to see numbers in ascending order
 * @author Eric Seo
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // Creates a scanner for user input
    Scanner input = new Scanner(System.in);
    
    // Asks the user to input a number
    System.out.println("Please enter an integer:");

    // Gets the number from user
    int num1 = input.nextInt();

    // Asks the user to input another number
    System.out.println("Please enter another integer:");

    // Gets the other number from user
    int num2 = input.nextInt();

    if (num1 > num2){
      System.out.println("Your numbers in ascending order are " + num2 + ", " + num1);
    } else {
      System.out.println("Your numbers in ascending order are " + num1 + ", " +  num2);
    }
    
  }
}
