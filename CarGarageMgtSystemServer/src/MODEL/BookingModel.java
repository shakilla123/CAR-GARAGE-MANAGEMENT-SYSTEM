/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MODEL;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

/**
 *
 * @author hp
 */
@Entity
public class BookingModel implements Serializable {
private static final long serialVersionUID = -2038264777729744095L; // Use the same value on both sides

   @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column (name = "booking_Id")
  private Integer bookingId;
 @Column (name= " price")
    private String Price;
  @Column (name = " booking_date")
    private Date  Bookingdate;
 @Column( name = " service")
    private String Service;
   @ManyToOne
   @JoinColumn( name = "client_Id")
   private ClientModel client;
   @ManyToOne
    @JoinColumn(name = "car_Id")
   private CarModel car;

    public BookingModel() {
    }

    public BookingModel(Integer bookingId) {
        this.bookingId = bookingId;
    }

    public BookingModel(Integer bookingId, String Price, Date Bookingdate, String Service, ClientModel client, CarModel car) {
        this.bookingId = bookingId;
        this.Price = Price;
        this.Bookingdate = Bookingdate;
        this.Service = Service;
        this.client = client;
        this.car = car;
    }

    public Integer getBookingId() {
        return bookingId;
    }

    public void setBookingId(Integer bookingId) {
        this.bookingId = bookingId;
    }

    public String getPrice() {
        return Price;
    }

    public void setPrice(String Price) {
        this.Price = Price;
    }

    public Date getBookingdate() {
        return Bookingdate;
    }

    public void setBookingdate(Date Bookingdate) {
        this.Bookingdate = Bookingdate;
    }

    public String getService() {
        return Service;
    }

    public void setService(String Service) {
        this.Service = Service;
    }

    public ClientModel getClient() {
        return client;
    }

    public void setClient(ClientModel client) {
        this.client = client;
    }

    public CarModel getCar() {
        return car;
    }

    public void setCar(CarModel car) {
        this.car = car;
    }

}
