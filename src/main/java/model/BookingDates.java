package model;

import javax.persistence.*;

/**
 * BookingDates class to record arrival and checkout dates
 */
@Entity
@Table(name = "bookingdates")
public class BookingDates {

    // Auto-generated int id
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    // String attribute to record arrival date
    @Column
    private String arrivalDate;

    // String attribute to record checkout date
    @Column
    private String checkoutDate;

    // ManyToOne relationship with Room class
    @ManyToOne
    private Room room;

    // Getters and setters for attributes


    public BookingDates() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getArrivalDate() {
        return arrivalDate;
    }

    public void setArrivalDate(String arrivalDate) {
        this.arrivalDate = arrivalDate;
    }

    public String getCheckoutDate() {
        return checkoutDate;
    }

    public void setCheckoutDate(String checkoutDate) {
        this.checkoutDate = checkoutDate;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }
}
