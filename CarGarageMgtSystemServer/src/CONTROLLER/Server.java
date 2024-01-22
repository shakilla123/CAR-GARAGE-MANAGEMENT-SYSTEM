/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CONTROLLER;



import SERVICE.Implementation.BookingServiceImpl;
import SERVICE.Implementation.CarServiceImpl;
import SERVICE.Implementation.ClientServiceImpl;
import SERVICE.Implementation.SignupDataServiceImpl;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
/**
 *
 * @author hp
 */
public class Server {
    public static void main(String[] args) {
        try {
          // System.setProperty("java.rmi.server.useCodebaseOnly", "false");
           System.setProperty("java.rmi.server.hostname", "127.0.0.1");
            Registry regist=LocateRegistry.createRegistry(5000);
           regist.rebind("car", new CarServiceImpl());
            regist.rebind("ClientModel", new ClientServiceImpl());
               regist.rebind("BookingModel", new BookingServiceImpl());   
               regist.rebind("SignUpcall",new SignupDataServiceImpl());
            System.out.println("Server Is Running on Port 5000");
             Thread.currentThread().join();
 
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
 
}
