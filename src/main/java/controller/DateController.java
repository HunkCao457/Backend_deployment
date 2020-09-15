package controller;


import model.BookingDates;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import service.DateService;

import java.util.List;

/**
 * DateController to provide path for all the CRUDs
 */
@CrossOrigin
@RestController
@RequestMapping(path = "/")
public class DateController {

    @Autowired
    private DateService dateService;

    /**
     * Provide path for DateService's getAllBookingDates method
     * @return List Returns a list of BookingDates objects
     */
    @RequestMapping(path = "bookingdates/all", method = RequestMethod.GET)
    public List<BookingDates> getAllBookingDates() {
        return dateService.getAllBookingDates();
    }

    /**
     * Provide path for DateService's getBookingDatesByID
     * @param id The int id of the BookingDates object to be read
     * @return BookingDates Returns the BookingDate object with matching id
     */
    @RequestMapping(path = "bookingdates/{id}", method = RequestMethod.GET)
    public BookingDates getBookingDatesByID(@PathVariable int id) {
        return dateService.getBookingDatesByID(id);
    }

    /**
     * Provide path for DateService's getBookingDatesByRoomID
     * @param id The int id of the Room attribute
     * @return List Returns all BookingDates object with matching Room's id
     */
    @RequestMapping(path = "bookingdates/room/{id}", method = RequestMethod.GET)
    public List<BookingDates> getBookingDatesByRoomID(@PathVariable int id) {
        return dateService.getBookingDatesByRoomID(id);
    }

    /**
     * Provide path for DateService's deleteBookingDates method
     * @param id The int id of the BookingDates object to be deleted
     * @return int Returns the int id of the deleted BookingDates object
     */
    @RequestMapping(path = "bookingdates/{id}", method = RequestMethod.DELETE)
    public int deleteBookingDates(@PathVariable int id) {
        return dateService.deleteBookingDates(id);
    }

    /**
     * Provide path for DateService's saveBookingDates method
     * @param dates The BookingDates object to be saved
     * @return BookingDates Returns the saved BookingDates object
     */
    @RequestMapping(path = "bookingdates", method = RequestMethod.POST)
    public BookingDates saveBookingDates(@RequestBody BookingDates dates) {
        return dateService.saveBookingDates(dates);
    }

    /**
     * Provide path for DateService's updateBookingDates method
     * @param dates The BookingDates object to be updated
     * @return BookingDates Returns the updated BookingDates object
     */
    @RequestMapping(path = "bookingdates", method = RequestMethod.PUT)
    public BookingDates updateBookingDates(@RequestBody BookingDates dates) {
        return dateService.updateBookingDates(dates);
    }

}
