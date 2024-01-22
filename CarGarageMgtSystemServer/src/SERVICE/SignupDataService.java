package SERVICE;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import MODEL.SignupData;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

/**
 *
 * @author hp
 */
public interface SignupDataService extends Remote{
    SignupData RegisterUser(SignupData user)throws RemoteException;
    SignupData UpdateUser(SignupData user)throws RemoteException;
    SignupData DeleteUser(SignupData user)throws RemoteException;
     SignupData authenticateUser(SignupData user)throws RemoteException;
    List<SignupData> user()throws RemoteException;
    
}
