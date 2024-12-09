/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Server;

import Client.IWordCountClient;
import java.rmi.RemoteException;

/**
 *
 * @author ekcg1
 */
public class Server implements IWordCountServer {
    
    @Override
    public void sendString(String text, String wordToSearch, IWordCountClient Client) {
        
    }

    @Override
    public boolean registerClient(IWordCountClient client, String clientName) throws RemoteException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
