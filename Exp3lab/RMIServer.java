package labs;
import java.rmi.*;
import java.rmi.server.*;
public class RMIServer extends UnicastRemoteObject implements Multiplication {
	private static final long serialVersionUID = 1L;
	public RMIServer() throws RemoteException {
		super();
	}
	public int multiply(int a, int b) throws RemoteException {
		return a * b;
	}
	public static void main(String args[]) throws Exception {
		RMIServer server = new RMIServer();
		System.out.println("RMI server is running");
		Naming.rebind("MultiplicationServer", server);
	}
}