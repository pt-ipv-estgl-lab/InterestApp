import java.util.Scanner;

/**
 * This class implements a simple program that
 * will compute the amount of interest that is
 * readed, invested at an interest
 * rate, also readed, for one year. The interest and
 * the value of the investment after one year are
 * printed to standard output.
 */

public class Interest {
    public static void main(String[] args) {
        /* Declare the variables. */

        Scanner stdin = new Scanner(System.in); // Create a Scanner on keyboard

        double principal; // The value of the investment.
        double rate; // The annual interest rate.
        double interest; // Interest earned in one year.

        System.out.println("Interest Computing");
        // Data input
        System.out.print("Enter the initial investment: ");
        principal = stdin.nextDouble();

      System.out.print("Enter the annual interest rate (as a decimal): ");
      rate = stdin.nextDouble();        

        /* Do the computations. */

        interest = principal * rate; // Compute the interest.

        principal = principal + interest;
        // Compute value of investment after one year, with interest.
        // (Note: The new value replaces the old value of principal.)

        /* Output the results. */

        System.out.println("The interest earned is $"+ interest);
        System.out.printf("The value of the investment after one year is $%1.2f\n",
            principal);
        stdin.close(); // close Scanner on keyboard
    }
}
