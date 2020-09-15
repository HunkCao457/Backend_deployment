package test;

import controller.DateController;
import model.Booking;
import model.BookingDates;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;

/**
 * Test class for DateController
 */
public class DateControllerTest {

    @Autowired
    private DateController dateController;

    @Test
    public void testSaveDate() {
        BookingDates dates = new BookingDates();
        BookingDates result = dateController.saveBookingDates(dates);
        Assert.assertEquals(dates, result);
    }

    @Test
    public void testUpdateDate() {}

    @Test
    public void testDeleteDate() {
        BookingDates dates = new BookingDates();
        BookingDates mock = dateController.saveBookingDates(dates);
        int result = dateController.deleteBookingDates(mock.getId());
        Assert.assertEquals(mock.getId(), result);
    }

    @Test
    public void testGetAllDates() {
        BookingDates dates = new BookingDates();
        BookingDates result = dateController.saveBookingDates(dates);
        Assert.assertEquals(dates, dateController.getAllBookingDates());
    }

    @Test
    public void testGetDateByID() {
        BookingDates dates = new BookingDates();
        BookingDates result = dateController.saveBookingDates(dates);
        Assert.assertEquals(result, dateController.getBookingDatesByID(result.getId()));
    }

    @Test
    public void testGetDateByRoomID() {
        BookingDates dates = new BookingDates();
        BookingDates result = dateController.saveBookingDates(dates);
        ArrayList<BookingDates> mock = new ArrayList();
        mock.add(result);
        Assert.assertEquals(mock, dateController.getBookingDatesByRoomID(dates.getRoom().getId()));
    }
}
