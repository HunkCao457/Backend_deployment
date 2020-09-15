package service;

import model.BookingDates;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * DateService class to handle CRUDs for BookingDates class
 */
@Transactional
@Service
public class DateService {

    @Autowired
    private SessionFactory sessionFactory;

    /**
     * Create a BookingDates object and save to the database
     * @param dates The BookingDates object to be saved
     * @return BookingDates Returns the saved BookingDates object
     */
    public BookingDates saveBookingDates(BookingDates dates) {
        sessionFactory.getCurrentSession().save(dates);
        return dates;
    }

    /**
     * Update an existing BookingDates object in the database
     * @param dates The BookingDates object to be updated
     * @return BookingDates Returns the updated BookingDates object
     */
    public BookingDates updateBookingDates(BookingDates dates) {
        sessionFactory.getCurrentSession().update(dates);
        return dates;
    }

    /**
     * Delete an existing BookingDates object by its id
     * @param id The int id of the BookingDates object to be deleted
     * @return int Returns the int id of the deleted BookingDates object
     */
    public int deleteBookingDates(int id) {
        BookingDates dates = getBookingDatesByID(id);
        sessionFactory.getCurrentSession().delete(dates);
        return id;
    }

    /**
     * Get all BookingDates object saved in the database
     * @return List Returns a list of BookingDates objects
     */
    public List<BookingDates> getAllBookingDates() {
        Query query = sessionFactory.getCurrentSession().createQuery("from BookingDates");
        return query.list();
    }

    /**
     * Get a BookingDates object by its int id
     * @param id The int id of the BookingDates object to be read
     * @return BookingDates Returns the BookingDate object with matching id
     */
    public BookingDates getBookingDatesByID(int id){
        Query query = sessionFactory.getCurrentSession().createQuery("from BookingDates where id=:id");
        query.setInteger("id", id);
        return (BookingDates) query.uniqueResult();
    }

    /**
     * Get all BookingDates object by their Room attribute's id
     * @param id The int id of the Room attribute
     * @return List Returns all BookingDates object with matching Room's id
     */
    public List<BookingDates> getBookingDatesByRoomID(int id){
        Query query = sessionFactory.getCurrentSession().createQuery("from BookingDates where room.id=:id");
        query.setInteger("id", id);
        return query.list();
    }
}
