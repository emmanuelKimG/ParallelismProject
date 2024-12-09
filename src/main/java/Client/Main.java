package Client;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;

/**
 *
 * @author ekcg1
 */
public class Main {
    public static final String UNIQUE_BINDING_NAME = "rmi.server";
    
    public static void main(String[] args) throws RemoteException, NotBoundException {
        new Client();
    }
}
