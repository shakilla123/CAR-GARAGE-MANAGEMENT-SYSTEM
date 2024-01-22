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
public class CarModel implements Serializable{
private static final long serialVersionUID = -2038264777729744095L; // Use the same value on both sides
 @Id 
@GeneratedValue (strategy = GenerationType.IDENTITY)
 @Column(name="car_Id")
 private Integer CarId;
  @Column(name="car_model")
  private String CarModel;
     @Column(name=" color")
   private String Color;
  @Column(name="carplate_number")
    private String CarplatNumber;
  
  @OneToMany(mappedBy = "car",fetch = FetchType.EAGER)
 private List<BookingModel> bookings = new ArrayList<>();

    public CarModel() {
    }

    public CarModel(Integer CarId) {
        this.CarId = CarId;
    }

    public CarModel(Integer CarId, String CarModel, String Color, String CarplatNumber) {
        this.CarId = CarId;
        this.CarModel = CarModel;
        this.Color = Color;
        this.CarplatNumber = CarplatNumber;
    }

    public Integer getCarId() {
        return CarId;
    }

    public void setCarId(Integer CarId) {
        this.CarId = CarId;
    }

    public String getCarModel() {
        return CarModel;
    }

    public void setCarModel(String CarModel) {
        this.CarModel = CarModel;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String Color) {
        this.Color = Color;
    }

    public String getCarplatNumber() {
        return CarplatNumber;
    }

    public void setCarplatNumber(String CarplatNumber) {
        this.CarplatNumber = CarplatNumber;
    }

    public List<BookingModel> getBookings() {
        return bookings;
    }

    public void setBookings(List<BookingModel> bookings) {
        this.bookings = bookings;
    }

    @Override
    public String toString() {
        return "CarModel{" + "CarId=" + CarId + '}';
    }
   
  
}
