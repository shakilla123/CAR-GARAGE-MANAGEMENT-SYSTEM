/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SERVICE;


import MODEL.ClientModel;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

/**
 *
 * @author hp
 */
public interface ClientService  extends Remote {
    ClientModel RegisterClient (ClientModel client) throws RemoteException; 
    ClientModel UpdateClient(ClientModel client) throws RemoteException;
    ClientModel DeleteClient(ClientModel client) throws RemoteException;
    ClientModel SearchByClientId(ClientModel client) throws RemoteException;
    List<ClientModel> clients() throws RemoteException;
}
