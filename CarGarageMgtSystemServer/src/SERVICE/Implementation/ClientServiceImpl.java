/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SERVICE.Implementation;

import DAO.ClientDao;
import MODEL.ClientModel;
import SERVICE.ClientService;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;

/**
 *
 * @author hp
 */
public class ClientServiceImpl extends UnicastRemoteObject implements ClientService{

    public ClientServiceImpl() throws RemoteException {
        super ();
    }
    ClientDao dao = new ClientDao();
            
    @Override
    public ClientModel RegisterClient(ClientModel client) throws RemoteException {
       return dao.RegisterClient(client);
    }

    @Override
    public ClientModel UpdateClient(ClientModel client) throws RemoteException {
       return dao.UpdateClient(client);
    }

    @Override
    public ClientModel DeleteClient(ClientModel client) throws RemoteException {
        return dao.DeleteClient(client);
    }

    @Override
    public ClientModel SearchByClientId(ClientModel client) throws RemoteException {
        return dao.searching(client);
    }

    @Override
    public List<ClientModel> clients() throws RemoteException {
        return dao.allclient();
    }
    
}
