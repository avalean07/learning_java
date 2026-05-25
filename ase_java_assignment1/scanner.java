import java.util.Scanner;

class Main {
  public static void main(String[] args) {
      Scanner myObj = new Scanner(System.in); //Creating a scanner object
      System.out.print("Enter username: ");

      String userName = myObj.nextLine(); //Reading the user input
      System.out.print("Your username is: " + userName); //print text + user's name 
    }

}
