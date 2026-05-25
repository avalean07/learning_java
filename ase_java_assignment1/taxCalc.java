import java.util.Scanner;

public class ComputeTax {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in); // create a new scanner

    System.out.println("(0-single filer, 1-married jointly,\n" +
        "2-married separately, 3-head of household)\n" +
        "Enter the filing status: ");

    int status = input.nextInt(); // enter the status here

    System.out.print("Enter a taxable income: "); // prompt the user to endter their taxable income
    int income = input.nextInt(); // take the input as a double floating point

    double tax = 0; // for computing the tax

    if (status == 0) { // tax for single filers
      if (income <= 8350) {
        tax = income * 0.10;
      } else if (income <= 33950) {
        tax = income * 0.10 + (income - 8350) * 0.15;
      } else if (income <= 82250) {
        tax = income * 0.10 + (income - 8350) * 0.15 + (income - 33950) * 0.25;
      } else if (income <= 171550) {
        tax = income * 0.10 + (income - 8350) * 0.15 + (income - 33950) * 0.25 +
            (income - 82250) * 0.28;
      } else if (income <= 372950) {
        tax = income * 0.10 + (income - 8350) * 0.15 + (income - 33950) * 0.25 +
            (income - 82250) * 0.28 + (income - 171500) * 0.33;
      } else {
        tax = income * 0.10 + (income - 8350) * 0.15 + (income - 33950) * 0.25 +
            (income - 82250) * 0.28 + (income - 171500) * 0.33 + (income - 372950) * 0.35;
      }
    } else if (status == 1) {

    }

  }

}
