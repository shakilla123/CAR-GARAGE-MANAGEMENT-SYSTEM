/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import MODEL.ClientModel;
import java.util.List;
import org.hibernate.*;
/**
 *
 * @author hp
 */

public class ClientDao {
          public ClientModel RegisterClient(ClientModel clientobj){
    try{
         Session ss=HibernateUtil.getSessionFactory().openSession();
            ss.save(clientobj);
            ss.beginTransaction().commit();
            ss.close();
            return clientobj;  
    } catch(Exception ex){
        ex.printStackTrace();
    }
    return null;    
  }  
  

  
    public ClientModel UpdateClient(ClientModel clientobj){
        
        try {
            Session ss=HibernateUtil.getSessionFactory().openSession();
            ss.update(clientobj);
            ss.beginTransaction().commit();
            ss.close();
            return clientobj;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        
        
        
        return null;
    }
 
    public ClientModel DeleteClient(ClientModel clientobj){
        
        try {
            Session ss=HibernateUtil.getSessionFactory().openSession();
            ss.delete(clientobj);
            ss.beginTransaction().commit();
            ss.close();
            return clientobj;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        
        
        
        return null;
    }
    
   
    
    public ClientModel searching(ClientModel clientobj){
        try {
            Session ss=HibernateUtil.getSessionFactory().openSession();
            
            ClientModel client=(ClientModel) ss.get(ClientModel.class,clientobj.getClientId());
            return client;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        
        return null;
    }

     public List<ClientModel> allclient(){
        try {
            Session ss=HibernateUtil.getSessionFactory().openSession(); 
            List<ClientModel> listclient= ss.createQuery("select theclient from ClientModel theclient").list();
            return listclient;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        
        return null;
    }

}
