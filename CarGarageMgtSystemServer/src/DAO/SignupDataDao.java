/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import MODEL.SignupData;
import java.util.List;
import org.hibernate.Session;

/**
 *
 * @author hp
 */
public class SignupDataDao {
         public SignupData registerUser(SignupData user){
        try {
             Session ss = HibernateUtil.getSessionFactory().openSession();
             ss.save(user);
             ss.beginTransaction().commit();
             ss.close();
             return user;
            
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
        
    }
 
    
    
     public SignupData updateUser(SignupData user){
        try {
             Session ss = HibernateUtil.getSessionFactory().openSession();
             ss.update(user);
             ss.beginTransaction().commit();
             ss.close();
             return user;
            
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
        
    }
      
      public SignupData deleteUser(SignupData user){
        try {
             Session ss = HibernateUtil.getSessionFactory().openSession();
             ss.delete(user);
             ss.beginTransaction().commit();
             ss.close();
             return user;
            
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
        
    }
      
       public List<SignupData> allusers(){
        try {
            
            Session ss= HibernateUtil.getSessionFactory().openSession();
            List<SignupData> user = ss.createQuery("select user from User user").list();
            ss.close();
            return user;
        } catch (Exception ex) {
            ex.printStackTrace();
            
        }
        return null;
        
    }
    
    public SignupData authenticateUser(String username, String password) {
        try {
            Session ss = HibernateUtil.getSessionFactory().openSession();
            
            // Query to find the user by username and password
            String query = "from SignUp u where u.username = :username and u.password = :password";
            
            SignupData theUser = (SignupData) ss.createQuery(query)
                .setParameter("username", username)
                .setParameter("password", password)
                .uniqueResult();
            
            ss.close();
            
            return theUser; // Returns the found user or null if not found
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }
}
