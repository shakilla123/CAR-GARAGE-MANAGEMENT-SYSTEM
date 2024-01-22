/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MODEL;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.*;

/**
 *
 * @author hp
 */
@Entity

public class ClientModel implements Serializable{
private static final long serialVersionUID = -2038264777729744095L; 
 @Id
 @GeneratedValue (strategy = GenerationType.IDENTITY)
  @Column(name="client_Id")
   private Integer ClientId;
   @Column(name=" name")
     private String Name;
      @Column(name=" email")
       private String Email;
       @Column( name= "phone_NO")
        private String  phoneNO; 
      
      @OneToMany(mappedBy = "client",fetch = FetchType.EAGER)
  private  List<BookingModel> bookings =new ArrayList<>();

    public ClientModel() {
    }

    public ClientModel(Integer ClientId) {
        this.ClientId = ClientId;
    }

    public ClientModel(Integer ClientId, String Name, String Email, String phoneNO) {
        this.ClientId = ClientId;
        this.Name = Name;
        this.Email = Email;
        this.phoneNO = phoneNO;
    }

    public Integer getClientId() {
        return ClientId;
    }

    public void setClientId(Integer ClientId) {
        this.ClientId = ClientId;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getPhoneNO() {
        return phoneNO;
    }

    public void setPhoneNO(String phoneNO) {
        this.phoneNO = phoneNO;
    }

    public List<BookingModel> getBookings() {
        return bookings;
    }

    public void setBookings(List<BookingModel> bookings) {
        this.bookings = bookings;
    }

    @Override
    public String toString() {
        return "ClientModel{" + "ClientId=" + ClientId + '}';
    }

}
