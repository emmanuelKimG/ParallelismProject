/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Client;

import Server.IWordCountServer;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

/**
 *
 * @author ekcg1
 */
public class Client implements IWordCountClient{
    
    public static final String UNIQUE_BINDING_NAME = "rmi.server";
    public IWordCountServer server;
    
    public Client() throws RemoteException, NotBoundException{
       final Registry registry = LocateRegistry.getRegistry("192.168.173.232",2733);

       System.out.println("REGISTRY LOOKUP ...");
       this.server = (IWordCountServer) registry.lookup(UNIQUE_BINDING_NAME);
       System.out.println("SERVER FOUND");
       
       connectToServer();
    }
    
    public boolean connectToServer() throws RemoteException{
       this.server.registerClient((IWordCountClient)UnicastRemoteObject.exportObject(this, 0), "Toñito");
       return true;
    }
    
    @Override
    public int countWords(String text, String searchedWord) throws RemoteException {
        int contador = 0;
        String[] palabras = text.split("\\s+"); // Divide el texto en palabras
        
        for (String palabra : palabras) {
            if (palabra.equals(searchedWord)) {
                contador++;
            }
        }
        return contador;
    }
    
}
