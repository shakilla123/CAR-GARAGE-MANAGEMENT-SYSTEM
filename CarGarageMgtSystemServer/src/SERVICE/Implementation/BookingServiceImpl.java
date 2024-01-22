/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SERVICE.Implementation;


import DAO.BookingDao;
import MODEL.BookingModel;
import SERVICE.BookingService;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;

/**
 *
 * @author hp
 */
public class BookingServiceImpl  extends UnicastRemoteObject implements BookingService {

    public BookingServiceImpl()  throws RemoteException{
        super();
    }
    BookingDao dao = new BookingDao();
    @Override
    public BookingModel RegisterBooking(BookingModel booking) throws RemoteException {
       return dao.RegisterBooking(booking);
    }

    @Override
    public BookingModel UpdateBooking(BookingModel booking) throws RemoteException {
       return dao.UpdateBooking(booking);
    }

    @Override
    public BookingModel DeleteBooking(BookingModel booking) throws RemoteException {
       return dao.DeleteBooking(booking);
    }

    @Override
    public BookingModel SearchByBookingId(BookingModel booking) throws RemoteException {
        return dao.searching(booking);
    }

    @Override
    public List<BookingModel> bookings() throws RemoteException {
       return dao.allbooking();
    }
    
}
