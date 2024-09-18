import java.rmi.Naming;

public class CalculatorClient {
  public static void main(String[] args) {
    try {
      // Look up the remote object in the RMI registry
      Calculator calculator = (Calculator) Naming.lookup("rmi://localhost:1111/CalculatorService");

      int a = 15;
      int b = 5;

      System.out.println("Addition: " + a + " + " + b + " = " + calculator.add(a, b));
      System.out.println("Subtraction: " + a + " - " + b + " = " + calculator.subtract(a, b));
      System.out.println("Multiplication: " + a + " * " + b + " = " + calculator.multiply(a, b));
      System.out.println("Division: " + a + " / " + b + " = " + calculator.divide(a, b));
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
