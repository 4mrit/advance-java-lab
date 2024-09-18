import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

public class CalculatorServer {
  public static void main(String[] args) {
    try {
      CalculatorImpl calculator = new CalculatorImpl();

      // RMI Registry banauni
      LocateRegistry.createRegistry(1111);

      // Url lai object sanga map garni
      Naming.rebind("rmi://localhost:1111/CalculatorService", calculator);

      System.out.println("Calculator Server is ready.");
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
