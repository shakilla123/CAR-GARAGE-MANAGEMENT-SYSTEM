/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SERVICE.Implementation;

import DAO.SignupDataDao;
import MODEL.SignupData;
import SERVICE.SignupDataService;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;

/**
 *
 * @author hp
 */
public class SignupDataServiceImpl extends UnicastRemoteObject implements SignupDataService{

    public SignupDataServiceImpl()  throws RemoteException{
    }
    SignupDataDao dao= new SignupDataDao();
    @Override
    public SignupData RegisterUser(SignupData user) throws RemoteException {
      return  dao.registerUser(user);
    }

    @Override
    public SignupData UpdateUser(SignupData user) throws RemoteException {
     return  dao.updateUser(user);
    }

    @Override
    public SignupData DeleteUser(SignupData user) throws RemoteException {
   return    dao.deleteUser(user);
    }

    @Override
    public SignupData authenticateUser(SignupData user) throws RemoteException {
         String username = user.getUsername();
        String password = user.getPassword();
   return   dao.authenticateUser(username, password);
    }

    @Override
    public List<SignupData> user() throws RemoteException {
        return dao.allusers();
    }
    
}
