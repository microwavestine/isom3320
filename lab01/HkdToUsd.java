import java.util.Scanner;

public class HkdToUsd {
  public static void main(String[] args) {
    double USD, HKD;
    Scanner scanner = new Scanner(System.in);
    String input = "";
    
    System.out.println("Enter HKD: ");
    
    input = scanner.nextLine();
    
    HKD = Double.parseDouble(input);
    USD = HKD / 7.7807;
    
    System.out.println(input + " HKD = " + USD + " USD");    
  }
}