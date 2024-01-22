/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SERVICE;



import MODEL.BookingModel;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

/**
 *
 * @author hp
 */
public interface BookingService extends Remote{
           // Method signature
    BookingModel RegisterBooking(BookingModel booking) throws RemoteException;
    BookingModel UpdateBooking(BookingModel booking) throws RemoteException;
    BookingModel DeleteBooking(BookingModel booking) throws RemoteException;
    BookingModel SearchByBookingId(BookingModel booking) throws RemoteException;
    List<BookingModel> bookings() throws RemoteException;

}
