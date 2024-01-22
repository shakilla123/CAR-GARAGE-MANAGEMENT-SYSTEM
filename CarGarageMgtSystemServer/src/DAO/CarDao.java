/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;
;
import MODEL.CarModel;
import java.util.List;
import org.hibernate.*;
/**
 *
 * @author hp
 */
public class CarDao {
  public CarModel RegisterCar(CarModel carobj){
    try{
         Session ss=HibernateUtil.getSessionFactory().openSession();
            ss.save(carobj);
            ss.beginTransaction().commit();
            ss.close();
            return carobj;  
    } catch(Exception ex){
        ex.printStackTrace();
    }
    return null;    
  }  
  
  
    public CarModel UpdateCar(CarModel carobj){
        
        try {
            Session ss=HibernateUtil.getSessionFactory().openSession();
            ss.update(carobj);
            ss.beginTransaction().commit();
            ss.close();
            return carobj;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        
        
        
        return null;
    }
 
    public CarModel DeleteCar(CarModel carobj){
        
        try {
            Session ss=HibernateUtil.getSessionFactory().openSession();
            ss.delete(carobj);
            ss.beginTransaction().commit();
            ss.close();
            return carobj;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        
        
        
        return null;
    }
    
   
    
    public CarModel searching(CarModel carobj){
        try {
            Session ss=HibernateUtil.getSessionFactory().openSession();
            CarModel car=(CarModel) ss.get(CarModel.class,carobj.getCarId());
            return car;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        
        return null;
    }
    
   
    
     public List<CarModel> allcar(){
        try {
            Session ss=HibernateUtil.getSessionFactory().openSession(); 
            List<CarModel> listcar= ss.createQuery("select thecar from CarModel thecar").list();
            return listcar;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        
        return null;
    }
  
}
