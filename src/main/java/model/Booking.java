package model;

import javax.persistence.*;

/**
 * Booking class to record details of each booking
 */
@Entity
@Table(name = "booking")
public class Booking {

    // Auto-generated int id
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    // OneToOne relationship with CustomerAccount class
    @OneToOne
    private CustomerAccount customer;

    // OneToOne relationship with Room class
    @OneToOne
    private Room room;

    // Attribute to record other requests of booking
    @Column
    private String request;

    // Int total price of room booking
    @Column
    private int total;

    // String attribute for arrival date
    @Column
    private String arrivalDate;

    // String attribute for checkout date
    @Column
    private String checkoutDate;


    // Getters and setters for attributes


    public Booking() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public String getRequest() {
        return request;
    }

    public void setRequest(String request) {
        this.request = request;
    }

    public CustomerAccount getCustomer() {
        return customer;
    }

    public void setCustomer(CustomerAccount customer) {
        this.customer = customer;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
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
}
