/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SERVICE.Implementation;


import DAO.CarDao;
import MODEL.CarModel;
import SERVICE.CarService;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;

/**
 *
 * @author hp
 */
public class CarServiceImpl extends UnicastRemoteObject implements CarService{

   public CarServiceImpl() throws RemoteException{
       super();
    }
    CarDao dao = new CarDao();
    @Override
    public CarModel RegisterCar(CarModel car) throws RemoteException {
        return  dao.RegisterCar(car);
    }

    @Override
    public CarModel UpdateCar(CarModel car) throws RemoteException {
       return dao.UpdateCar(car);
    }

    @Override
    public CarModel DeleteCar(CarModel car) throws RemoteException {
       return dao.DeleteCar(car);
    }

    @Override
    public CarModel SearchByCarId(CarModel car) throws RemoteException {
 return dao.searching(car);
    }

    @Override
    public List<CarModel> cars() throws RemoteException {
        return dao.allcar();
    }

    
}
