import java.util.Scanner;

public class lllogin {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    String username = "myUsername";
    String password = "myPassword";
    
    System.out.println("Welcome to the login page!");
    System.out.println("Please enter your username and password to login.");
    
    System.out.print("Username: ");
    String enteredUsername = input.next();
    
    System.out.print("Password: ");
    String enteredPassword = input.next();
    
    if (enteredUsername.equals(username) && enteredPassword.equals(password)) {
      System.out.println("Login successful!");
    } else {
      System.out.println("Invalid username or password. Please try again.");
    }
  }
}
