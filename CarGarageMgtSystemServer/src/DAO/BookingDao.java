/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;


import MODEL.BookingModel;
import java.util.List;
import org.hibernate.*;

/**
 *
 * @author hp
 */
public class BookingDao {

      public BookingModel RegisterBooking(BookingModel boookingobj){
    try{
         Session ss=HibernateUtil.getSessionFactory().openSession();
            ss.save(boookingobj);
            ss.beginTransaction().commit();
            ss.close();
            return boookingobj;  
    } catch(Exception ex){
        ex.printStackTrace();
    }
    return null;    
  }  
  

  
    public BookingModel UpdateBooking(BookingModel boookingobj){
        
        try {
            Session ss=HibernateUtil.getSessionFactory().openSession();
            ss.update(boookingobj);
            ss.beginTransaction().commit();
            ss.close();
            return boookingobj;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        
        
        
        return null;
    }
  
    public BookingModel DeleteBooking(BookingModel boookingobj){
        
        try {
            Session ss=HibernateUtil.getSessionFactory().openSession();
            ss.delete(boookingobj);
            ss.beginTransaction().commit();
            ss.close();
            return boookingobj;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        
        
        
        return null;
    }
    
  
    
    public BookingModel searching(BookingModel bookingobj){
        try {
            Session ss=HibernateUtil.getSessionFactory().openSession();
            
            BookingModel booking=(BookingModel) ss.get(BookingModel.class,bookingobj.getBookingId());
            return booking;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        
        return null;
    }
    
   
    
     public List<BookingModel> allbooking(){
        try {
            Session ss=HibernateUtil.getSessionFactory().openSession(); 
            List<BookingModel> listbooking = ss.createQuery("select thebooking from BookingModel thebooking ").list();
            return listbooking;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        
        return null;
    }
    
}
