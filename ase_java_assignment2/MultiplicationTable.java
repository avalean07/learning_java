public class MultiplicationTable {
  public static void main(String[] args)

  {
    // Table headers
    System.out.println("             Multiplication Table");
    System.out.println("---------------------------------");

    int prod = 1;
    for (int i = 1; i <= 10; i++) {
      for (int j = 1; j <= 10; j++) {
        prod = i * j;

        // "%4d" pads the number to take up exactly 4 spaces.
        // This keeps the columns perfectly aligned!
        System.out.printf("%4d", prod);
      }
      System.out.println(); // == '\n'
    }
  }
}
