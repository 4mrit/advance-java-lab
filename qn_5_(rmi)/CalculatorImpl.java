import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class CalculatorImpl extends UnicastRemoteObject implements Calculator {

  protected CalculatorImpl() throws RemoteException {
    super();
  }

  @Override
  public int add(int x, int y) throws RemoteException {
    return x + y;
  }

  @Override
  public int subtract(int x, int y) throws RemoteException {
    return x - y;
  }

  @Override
  public int multiply(int x, int y) throws RemoteException {
    return x * y;
  }

  @Override
  public int divide(int x, int y) throws RemoteException {
    if (y == 0) {
      throw new ArithmeticException("Division by zero is not allowed.");
    }
    return x / y;
  }
}
