/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Server;

import Client.IWordCountClient;
import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author ekcg1
 */
public interface IWordCountServer extends Remote {
    void sendString(String text, String wordToSearch ,IWordCountClient Client) throws RemoteException;
    boolean registerClient(IWordCountClient client, String clientName) throws RemoteException;
}
